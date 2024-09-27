import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.io.IOException;

public class FileStore_3 {
    public static void main(String[] args) {
        try {
            FileStore fileStore = FileSystems.getDefault().getFileStores().iterator().next();
            long usableSpace = fileStore.getUsableSpace();
            System.out.println("Usable space: " + usableSpace + " bytes");
        } catch (IOException e) {
            System.out.println("Error accessing file store: " + e.getMessage());
        }
    }
}
