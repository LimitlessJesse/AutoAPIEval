import javax.activation.FileDataSource;
import java.io.File;

public class FileDataSource_2 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        File file = fileDataSource.getFile();
        System.out.println("File path: " + file.getPath());
    }
}
