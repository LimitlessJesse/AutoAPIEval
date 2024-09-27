import java.nio.file.*;

public class FileSystem_5 {
    public static void main(String[] args) {
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            WatchService watchService = fileSystem.newWatchService();
            System.out.println("WatchService created successfully.");
        } catch (Exception e) {
            System.out.println("Error creating WatchService: " + e.getMessage());
        }
    }
}
