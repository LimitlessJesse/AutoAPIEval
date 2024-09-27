import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class Properties_5 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        try {
            InputStream inputStream = Properties_5.class.getResourceAsStream("example.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
