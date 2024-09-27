import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_1 {
    public static void main(String[] args) {
        Path path = Paths.get("/foo", "bar", "gus");
        System.out.println(path);
    }
}
