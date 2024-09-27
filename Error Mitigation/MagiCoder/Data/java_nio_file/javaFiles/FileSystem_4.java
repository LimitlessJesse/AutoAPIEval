import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystem_4 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        for (Path path : fs.getRootDirectories()) {
            System.out.println(path);
        }
    }
}
