import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Properties_5 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
            System.out.println(properties.getProperty("key"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
