import java.util.Properties;

public class Properties_3 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        String value1 = properties.getProperty("key1", "defaultValue");
        String value2 = properties.getProperty("key2", "defaultValue");
        String value3 = properties.getProperty("key3", "defaultValue");

        System.out.println("Value of key1: " + value1);
        System.out.println("Value of key2: " + value2);
        System.out.println("Value of key3: " + value3);
    }
}
