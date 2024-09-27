import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_4 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        try {
            FileOutputStream output = new FileOutputStream("config.properties");
            properties.store(output, "This is a sample properties file");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
