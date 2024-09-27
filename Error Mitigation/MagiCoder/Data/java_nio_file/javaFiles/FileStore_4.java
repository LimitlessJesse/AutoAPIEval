import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStore_4 {
    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath(".");
        FileStore store = Files.getFileStore(path);
        boolean isReadOnly = store.isReadOnly();
        System.out.println("Is the file store read-only? " + isReadOnly);
    }
}
