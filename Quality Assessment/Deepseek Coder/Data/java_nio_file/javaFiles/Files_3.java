import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Files_3 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("path_to_your_file"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
