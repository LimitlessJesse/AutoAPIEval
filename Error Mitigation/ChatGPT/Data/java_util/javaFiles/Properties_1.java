import java.util.Properties;

public class Properties_1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("key1", "value1");
        prop.setProperty("key2", "value2");

        String value1 = prop.getProperty("key1");
        String value2 = prop.getProperty("key2");
        
        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
    }
}
