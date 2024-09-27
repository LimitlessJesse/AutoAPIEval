import java.nio.file.AccessMode;
import java.nio.file.FileSystemProvider;
import java.nio.file.Path;
import java.io.IOException;

public class FileSystemProvider_5 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystemProvider.installedProviders().get(0); // Get the default file system provider
        Path path = Path.of("example.txt"); // Specify the path to the file to check
        
        try {
            provider.checkAccess(path, AccessMode.READ, AccessMode.WRITE); // Check if the file is readable and writable
            System.out.println("File is readable and writable");
        } catch (IOException e) {
            System.out.println("Error checking access to the file: " + e.getMessage());
        }
    }
}
