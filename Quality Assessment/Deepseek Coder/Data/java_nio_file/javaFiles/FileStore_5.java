import java.nio.file.*;

public class FileStore_5 {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystems.getDefault();
        FileStore store = fs.getFileStores().iterator().next();
        System.out.println(store.name());
    }
}
