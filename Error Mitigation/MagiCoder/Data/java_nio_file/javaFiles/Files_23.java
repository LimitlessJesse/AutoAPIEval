import java.nio.file.*;
import java.io.IOException;

public class Files_23 {
    public static void main(String[] args) {
        try {
            Path tempDir = Files.createTempDirectory("myTempDir");
            System.out.println("Created temporary directory: " + tempDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
