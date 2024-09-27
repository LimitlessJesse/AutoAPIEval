import java.nio.file.*;
import java.io.IOException;

public class FileStore_4 {
    public static void main(String[] args) {
        try {
            FileStore fs = FileSystems.getDefault().getFileStore(Paths.get("/"));
            boolean isReadOnly = fs.isReadOnly();
            System.out.println("Is the file store read-only? " + isReadOnly);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
