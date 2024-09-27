import java.util.Properties;

public class Properties_2 {
    public static void main(String[] args) {
        // Create a new Properties object
        Properties properties = new Properties();

        // Set a property
        properties.setProperty("key1", "value1");

        // Get the property
        String value = properties.getProperty("key1");

        // Print the value
        System.out.println(value);
    }
}
