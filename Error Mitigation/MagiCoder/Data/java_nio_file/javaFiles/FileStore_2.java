import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.io.IOException;

public class FileStore_2 {
    public static void main(String[] args) {
        try {
            FileStore store = FileSystems.getDefault().getFileStores().iterator().next();
            long usableSpace = store.getUsableSpace();
            System.out.println("Usable space: " + usableSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
