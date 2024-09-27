import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_1 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\", "Users", "Public", "Documents", "file.txt");
        System.out.println(path);
    }
}
