import java.nio.file.Paths;
import java.net.URI;
import java.nio.file.Path;

public class Paths_2 {
    public static void main(String[] args) {
        URI uri = URI.create("file:///path/to/file.txt");
        Path path = Paths.get(uri);
        System.out.println("Path: " + path);
    }
}
