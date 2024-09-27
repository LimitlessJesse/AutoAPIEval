import java.nio.file.*;

public class FileSystem_5 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        FileSystemProvider provider = fs.provider();
        System.out.println(provider);
    }
}
