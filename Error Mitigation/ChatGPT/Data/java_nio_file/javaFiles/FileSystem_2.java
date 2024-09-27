import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

public class FileSystem_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        FileSystemProvider provider = fs.provider();
        System.out.println("Provider: " + provider);
    }
}
