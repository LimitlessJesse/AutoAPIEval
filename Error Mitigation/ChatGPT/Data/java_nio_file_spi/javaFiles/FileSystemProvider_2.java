import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;

public class FileSystemProvider_2 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystemProvider.installedProviders().get(0); // Get the first installed provider
        Path path = Path.of("example.txt"); // Path to the file
        Map<String, Object> env = new HashMap<>(); // Environment properties
        
        try {
            FileSystem fileSystem = provider.newFileSystem(path, env); // Create a new file system
            System.out.println("New file system created: " + fileSystem.toString());
        } catch (UnsupportedOperationException | IllegalArgumentException | IOException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
