import java.nio.file.*;
import java.io.IOException;

public class Files_1 {
    public static void main(String[] args) {
        Path dir = Paths.get("newDirectory");
        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully: " + dir);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
