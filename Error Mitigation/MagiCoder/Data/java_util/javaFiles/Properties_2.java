import java.util.Properties;

public class Properties_2 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        String value = properties.getProperty("key1");
        System.out.println(value);  // Output: value1
    }
}
