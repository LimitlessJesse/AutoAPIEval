import java.io.StringReader;
import java.util.Properties;
import java.io.IOException;

public class Properties_5 {
    
    public static void main(String[] args) {
        String propertiesString = "key1=value1\nkey2=value2";
        Properties properties = new Properties();
        
        try {
            properties.load(new StringReader(propertiesString));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Display the properties
        System.out.println(properties.getProperty("key1"));
        System.out.println(properties.getProperty("key2"));
    }
}
