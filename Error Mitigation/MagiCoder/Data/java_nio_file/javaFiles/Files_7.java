import java.nio.file.*;

public class Files_7 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\user\\Desktop");
        boolean isDir = Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS);
        System.out.println("Is directory: " + isDir);
    }
}
