import java.nio.file.*;
import java.io.IOException;

public class Files_25 {
    public static void main(String[] args) {
        Path link = Paths.get("/path/to/your/link");
        try {
            Path target = Files.readSymbolicLink(link);
            System.out.println("The target of the link is: " + target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
