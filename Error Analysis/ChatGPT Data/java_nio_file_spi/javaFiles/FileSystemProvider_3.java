import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.FileSystem;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;

public class FileSystemProvider_3 {
    public static void main(String[] args) {
        URI uri = URI.create("file:///path/to/directory");
        Map<String, Object> env = new HashMap<>();
        FileSystemProvider provider = FileSystems.getDefault().provider();
        
        try {
            FileSystem fs = provider.newFileSystem(uri, env);
            Path path = fs.getPath("/test.txt");
            System.out.println("New file system created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating new file system: " + e.getMessage());
        }
    }
}
