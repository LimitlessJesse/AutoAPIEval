import java.nio.file.FileSystem;
import java.nio.file.spi.FileSystemProvider;
import java.net.URI;

public class FileSystemProvider_3 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystemProvider.installedProviders().get(0); // Assuming the default provider is used
        URI uri = URI.create("file:///path/to/file/system");
        
        try {
            FileSystem fileSystem = provider.getFileSystem(uri);
            System.out.println("File system retrieved: " + fileSystem.toString());
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (FileSystemNotFoundException e) {
            System.err.println("FileSystemNotFoundException: " + e.getMessage());
        } catch (SecurityException e) {
            System.err.println("SecurityException: " + e.getMessage());
        }
    }
}
