import java.io.IOException;
import java.nio.file.FileStore;

public class FileStore_3 {
    public static void main(String[] args) {
        try {
            FileStore fileStore = FileStore.getDefault();
            long unallocatedSpace = fileStore.getUnallocatedSpace();
            System.out.println("Unallocated space: " + unallocatedSpace + " bytes");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
