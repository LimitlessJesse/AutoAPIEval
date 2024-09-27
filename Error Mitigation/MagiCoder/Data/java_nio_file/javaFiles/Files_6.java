import java.nio.file.*;

public class Files_6 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
        System.out.println("The file exists: " + exists);
    }
}
