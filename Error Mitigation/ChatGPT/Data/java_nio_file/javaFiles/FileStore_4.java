import java.io.IOException;
import java.nio.file.FileStore;

public class FileStore_4 {
    public static void main(String[] args) {
        try {
            FileStore fileStore = FileStore.getDefault();
            String type = fileStore.type();
            System.out.println("File store type: " + type);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
