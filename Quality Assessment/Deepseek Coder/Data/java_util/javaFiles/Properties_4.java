import java.util.Properties;
import java.util.Set;

public class Properties_4 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + ": " + properties.getProperty(key));
        }
    }
}
