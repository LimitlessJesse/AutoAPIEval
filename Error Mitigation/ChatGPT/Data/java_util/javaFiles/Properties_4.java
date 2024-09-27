import java.util.Properties;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Properties_4 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");

        try (OutputStream output = new FileOutputStream("output.properties")) {
            properties.store(output, "Sample Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
