import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.TabularType;
import javax.management.openmbean.InvalidKeyException;
import javax.management.openmbean.OpenDataException;

public class TabularDataSupport_18 {
    public static void main(String[] args) throws InvalidKeyException, OpenDataException {
        // Create two TabularDataSupport objects
        TabularDataSupport td1 = new TabularDataSupport();
        TabularDataSupport td2 = new TabularDataSupport();

        // Define a composite type
        CompositeType ct = new CompositeType("ct", "A composite type", new String[] {"a", "b"}, new String[] {"An attribute", "Another attribute"}, new SimpleType[] {SimpleType.STRING, SimpleType.INTEGER});

        // Define a tabular type
        TabularType tt = new TabularType("tt", "A tabular type", ct, new String[][] {{"a"}, {"b"}});

        // Add data to the first TabularDataSupport object
        td1.setTabularType(tt);
        td1.setValue("a", "Hello");
        td1.setValue("b", 1);

        // Add data to the second TabularDataSupport object
        td2.setTabularType(tt);
        td2.setValue("a", "Hello");
        td2.setValue("b", 1);

        // Compare the two TabularDataSupport objects
        boolean isEqual = td1.equals(td2);

        // Print the result
        System.out.println("Are the two TabularDataSupport objects equal? " + isEqual);
    }
}
