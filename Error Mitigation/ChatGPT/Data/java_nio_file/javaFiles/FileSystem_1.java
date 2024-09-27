import java.nio.file.FileSystem;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class FileSystem_1 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("/foo", "bar", "gus");
        System.out.println(path);
    }
}
