import javax.activation.FileDataSource;
import java.io.File;

public class FileDataSource_3 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource(new File("file.txt"));
        File file = fileDataSource.getFile();
        System.out.println("File name: " + file.getName());
    }
}
