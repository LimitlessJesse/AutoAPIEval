import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

public class FileSystemProvider_1 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystems.getDefault().provider();
        String scheme = provider.getScheme();
        System.out.println("Default file system provider scheme: " + scheme);
    }
}
