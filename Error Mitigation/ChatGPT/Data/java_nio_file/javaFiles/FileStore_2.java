import java.io.IOException;
import java.nio.file.FileStore;

public class FileStore_2 {
    public static void main(String[] args) {
        try {
            FileStore fileStore = FileStore.getDefault();
            long usableSpace = fileStore.getUsableSpace();
            System.out.println("Usable space: " + usableSpace + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
