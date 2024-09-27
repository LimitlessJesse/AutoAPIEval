import java.nio.file.*;
import java.io.IOException;

public class Files_2 {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try {
            Files.createFile(path);
            System.out.println("File created successfully: " + path);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
