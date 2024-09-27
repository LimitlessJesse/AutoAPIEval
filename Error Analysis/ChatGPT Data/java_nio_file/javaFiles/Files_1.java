import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Files_1 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
