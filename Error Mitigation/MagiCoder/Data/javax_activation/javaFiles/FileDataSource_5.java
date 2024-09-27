import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class FileDataSource_5 {
    public static void main(String[] args) {
        DataSource ds = new FileDataSource("path_to_your_file");
        String name = ds.getName();
        System.out.println("Name of the file: " + name);
    }
}
