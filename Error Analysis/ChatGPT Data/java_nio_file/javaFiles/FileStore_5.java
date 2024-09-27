import java.io.IOException;
import java.nio.file.FileStore;

public class FileStore_5 {
    public static void main(String[] args) {
        try {
            FileStore fileStore = FileStore.getDefault();
            boolean readOnly = fileStore.isReadOnly();
            System.out.println("Is file store read-only? " + readOnly);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
