import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.FileSystem;

public class FileSystem_5 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Iterable<Path> rootDirectories = fs.getRootDirectories();
        
        for (Path rootDir : rootDirectories) {
            System.out.println(rootDir);
        }
    }
}
