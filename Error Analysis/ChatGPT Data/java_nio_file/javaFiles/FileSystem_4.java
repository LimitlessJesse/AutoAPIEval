import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class FileSystem_4 {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:**.txt");
        System.out.println(pathMatcher.matches(fileSystem.getPath("test.txt")));
    }
}
