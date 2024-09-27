import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.TabularType;
import javax.management.openmbean.InvalidKeyException;
import javax.management.openmbean.OpenDataException;

public class TabularDataSupport_19 {
    public static void main(String[] args) {
        try {
            // Create a TabularType
            CompositeType compositeType = new CompositeType("MyType", "MyType desc", new String[] { "name", "age" }, new Class[] { String.class, int.class }, new String[] { "name desc", "age desc" }, SimpleType.CC_STRING, SimpleType.CC_INTEGER);

            // Create a TabularDataSupport object
            TabularDataSupport tabularDataSupport = new TabularDataSupport(compositeType);

            // Add a row to the TabularDataSupport object
            tabularDataSupport.put("name", "John");
            tabularDataSupport.put("age", 25);

            // Generate a hash code for the TabularDataSupport object
            int hashCode = tabularDataSupport.hashCode();

            // Print the hash code
            System.out.println("Hash code: " + hashCode);
        } catch (InvalidKeyException | OpenDataException e) {
            e.printStackTrace();
        }
    }
}
