import java.util.Properties;

public class Properties_1 {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("key1", "value1");
        
        String value = props.getProperty("key1");
        System.out.println("Value for key1: " + value);
    }
}
