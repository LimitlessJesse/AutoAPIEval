import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class FileDataSource_5 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        System.out.println(fileDataSource.getName());
    }
}
