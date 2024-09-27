import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class FileStore_2 {
    public static void main(String[] args) {
        try {
            FileStore store = FileSystems.getDefault().getFileStores().iterator().next();
            long totalSpace = store.getTotalSpace();
            System.out.println("Total space in bytes: " + totalSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
