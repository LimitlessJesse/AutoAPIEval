import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileStore_5 {
    public static void main(String[] args) {
        try {
            Path path = FileSystems.getDefault().getPath(".");
            FileStore store = Files.getFileStore(path);
            String name = store.name();
            System.out.println("Name of the file store: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
