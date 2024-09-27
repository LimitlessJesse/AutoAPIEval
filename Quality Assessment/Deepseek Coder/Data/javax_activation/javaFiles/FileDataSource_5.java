import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;

public class FileDataSource_5 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileDataSource fileDataSource = new FileDataSource(file);
            String contentType = fileDataSource.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
