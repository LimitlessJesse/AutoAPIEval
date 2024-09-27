import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.io.IOException;

public class Files_22 {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("prefix", ".txt");
            System.out.println("Created temporary file: " + tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
