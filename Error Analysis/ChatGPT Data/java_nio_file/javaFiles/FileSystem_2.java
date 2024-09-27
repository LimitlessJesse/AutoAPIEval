import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.FileSystem;
import java.util.Iterator;

public class FileSystem_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Iterable<Path> rootDirs = fs.getRootDirectories();
        
        Iterator<Path> iterator = rootDirs.iterator();
        while(iterator.hasNext()) {
            Path rootDir = iterator.next();
            System.out.println(rootDir);
        }
    }
}
