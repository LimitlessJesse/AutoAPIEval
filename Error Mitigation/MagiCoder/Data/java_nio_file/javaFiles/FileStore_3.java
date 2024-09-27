import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.io.IOException;

public class FileStore_3 {
    public static void main(String[] args) {
        try {
            FileStore store = FileSystems.getDefault().getFileStores().iterator().next();
            long unallocatedSpace = store.getUnallocatedSpace();
            System.out.println("Unallocated space: " + unallocatedSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
