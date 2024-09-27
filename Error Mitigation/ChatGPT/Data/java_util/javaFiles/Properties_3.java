import java.util.Properties;
import java.util.Enumeration;

public class Properties_3 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        Enumeration<?> keys = properties.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + properties.getProperty(key));
        }
    }
}
