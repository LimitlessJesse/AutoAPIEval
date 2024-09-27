import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.io.IOException;

public class FileStore_1 {
    public static void main(String[] args) {
        try {
            FileStore store = FileSystems.getDefault().getFileStores().iterator().next();
            long totalSpace = store.getTotalSpace();
            System.out.println("Total space: " + totalSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
