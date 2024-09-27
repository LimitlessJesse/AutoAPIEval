import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Files_10 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        try {
            boolean isHidden = Files.isHidden(path);
            System.out.println("Is the file hidden? " + isHidden);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
