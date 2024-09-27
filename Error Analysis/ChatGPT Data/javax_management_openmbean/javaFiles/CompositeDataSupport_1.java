import javax.management.openmbean.CompositeDataSupport;

public class CompositeDataSupport_1 {
    public static void main(String[] args) {
        // Creating a sample CompositeDataSupport object
        CompositeDataSupport data = new CompositeDataSupport();

        // Using the get method to retrieve value based on key
        Object value = data.get("key");

        // Printing the retrieved value
        System.out.println("Value for key 'key': " + value);
    }
}
