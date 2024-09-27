import java.nio.file.*;

public class FileStore_3 {
    public static void main(String[] args) throws Exception {
        FileStore fs = FileSystems.getDefault().getFileStore(Paths.get("/"));
        long unallocatedSpace = fs.getUnallocatedSpace();
        System.out.println("Unallocated space: " + unallocatedSpace + " bytes");
    }
}
