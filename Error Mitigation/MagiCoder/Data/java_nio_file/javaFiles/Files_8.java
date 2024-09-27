import java.nio.file.*;

public class Files_8 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        boolean isRegularFile = Files.isRegularFile(path);
        System.out.println("Is regular file: " + isRegularFile);
    }
}
