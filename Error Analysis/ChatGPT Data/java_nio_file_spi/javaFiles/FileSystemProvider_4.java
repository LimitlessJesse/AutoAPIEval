import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

public class FileSystemProvider_4 {
    public static void main(String[] args) {
        FileSystemProvider provider = FileSystemProvider.installedProviders().get(0);
        Path path = Path.of("example.txt");
        Set<OpenOption> options = Set.of();
        FileAttribute<?>[] attrs = new FileAttribute<?>[0];

        try {
            FileChannel fileChannel = provider.newFileChannel(path, options, attrs);
            System.out.println("FileChannel created successfully for: " + path.toString());
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
