import java.nio.file.*;
import java.io.IOException;

public class Files_16 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("path_to_your_file");
            String attribute = "basic:size";
            Object attributeValue = Files.getAttribute(path, attribute);
            System.out.println("Attribute value: " + attributeValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
