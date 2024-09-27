import java.nio.file.*;

public class FileStore_2 {
    public static void main(String[] args) throws Exception {
        FileStore store = Files.getFileStore(Paths.get("/"));
        long usableSpace = store.getUsableSpace();
        System.out.println("Usable space: " + usableSpace + " bytes");
    }
}
