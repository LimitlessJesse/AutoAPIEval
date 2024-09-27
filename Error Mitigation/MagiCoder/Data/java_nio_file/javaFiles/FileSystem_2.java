import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.InvalidPathException;

public class FileSystem_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystem.getDefault();
        try {
            Path path = fs.getPath("/foo", "bar", "gus");
            System.out.println(path);
        } catch (InvalidPathException e) {
            e.printStackTrace();
        }
    }
}
