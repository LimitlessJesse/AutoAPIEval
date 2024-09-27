import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.InvalidKeyException;

public class CompositeDataSupport_1 {
    public static void main(String[] args) {
        CompositeType compositeType = null; // You need to define this
        CompositeDataSupport compositeDataSupport = new CompositeDataSupport(compositeType);

        try {
            compositeDataSupport.add("key1", "value1");
            compositeDataSupport.add("key2", "value2");

            boolean containsKey1 = compositeDataSupport.containsKey("key1");
            boolean containsKey2 = compositeDataSupport.containsKey("key2");
            boolean containsKey3 = compositeDataSupport.containsKey("key3");

            System.out.println("Contains key1: " + containsKey1);
            System.out.println("Contains key2: " + containsKey2);
            System.out.println("Contains key3: " + containsKey3);

        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
