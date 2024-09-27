import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class FileSystemProvider_5 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystemProvider.provider();
        Path path = Path.of("example.txt");
        Set<OpenOption> options = Set.of();
        ExecutorService executor = null;
        FileAttribute<?>[] attrs = new FileAttribute<?>[0];
        
        try {
            AsynchronousFileChannel channel = provider.newAsynchronousFileChannel(path, options, executor, attrs);
            System.out.println("AsynchronousFileChannel created successfully");
        } catch (Exception e) {
            System.out.println("Error creating AsynchronousFileChannel: " + e.getMessage());
        }
    }
}
