import java.util.Properties;

public class Properties_1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        System.out.println(properties.getProperty("key1")); // Outputs: value1
        System.out.println(properties.getProperty("key2")); // Outputs: value2
    }
}
