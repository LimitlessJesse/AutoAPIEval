import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;

public class FileDataSource_2 {
    public static void main(String[] args) {
        FileDataSource fds = new FileDataSource("path_to_your_file");
        try {
            File file = fds.getFile();
            if (file!= null) {
                System.out.println("File path: " + file.getAbsolutePath());
                System.out.println("File size: " + file.length() + " bytes");
            } else {
                System.out.println("File not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
