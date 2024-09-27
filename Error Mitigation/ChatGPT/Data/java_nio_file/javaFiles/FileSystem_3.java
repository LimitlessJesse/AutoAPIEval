import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class FileSystem_3 {
    public static void main(String[] args) {
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            WatchService watchService = fileSystem.newWatchService();
            System.out.println("New watch service created: " + watchService.toString());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
