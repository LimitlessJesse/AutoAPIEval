import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;

public class FileSystemProvider_4 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystems.getDefault().provider();
        URI uri = URI.create("file:///path/to/file.txt");
        
        try {
            Path path = provider.getPath(uri);
            System.out.println("Path: " + path);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (FileSystemNotFoundException e) {
            System.err.println("FileSystemNotFoundException: " + e.getMessage());
        } catch (SecurityException e) {
            System.err.println("SecurityException: " + e.getMessage());
        }
    }
}
