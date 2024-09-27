import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystem_3 {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("C:", "Users", "username", "Documents");
        System.out.println(path);
    }
}
