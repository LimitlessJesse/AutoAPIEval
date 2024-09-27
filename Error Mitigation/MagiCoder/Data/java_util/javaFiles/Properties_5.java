import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_5 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
