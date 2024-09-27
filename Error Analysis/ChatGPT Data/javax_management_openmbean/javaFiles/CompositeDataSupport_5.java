import javax.management.openmbean.CompositeDataSupport;

public class CompositeDataSupport_5 {
    public static void main(String[] args) {
        // Create a CompositeDataSupport object
        String[] itemNames = {"key1", "key2"};
        Object[] itemValues = {1, "value"};
        CompositeDataSupport data = new CompositeDataSupport("typeName", itemNames, itemValues);

        // Using toString() method to get a string representation of the object
        String dataString = data.toString();
        System.out.println(dataString);
    }
}
