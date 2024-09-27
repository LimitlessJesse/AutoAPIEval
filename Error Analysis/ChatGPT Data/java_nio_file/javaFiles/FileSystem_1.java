import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.spi.FileSystemProvider;

public class FileSystem_1 {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        FileSystemProvider provider = fileSystem.provider();
        System.out.println("Provider: " + provider);
    }
}
