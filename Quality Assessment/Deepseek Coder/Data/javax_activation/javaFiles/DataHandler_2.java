import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;

public class DataHandler_2 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            DataSource source = new FileDataSource(file);
            DataHandler handler = new DataHandler(source);
            String contentType = handler.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
