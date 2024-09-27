import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_4 {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        boolean isRegular = Files.isRegularFile(path);
        System.out.println("Is regular file: " + isRegular);
    }
}
