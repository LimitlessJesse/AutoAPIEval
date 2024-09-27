import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStore_4 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\");
            FileStore fileStore = Files.getFileStore(path);
            long unallocatedSpace = fileStore.getUnallocatedSpace();
            System.out.println("Unallocated space on the drive: " + unallocatedSpace + " bytes");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
