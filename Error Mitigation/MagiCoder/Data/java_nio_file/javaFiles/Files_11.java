import java.nio.file.*;
import java.io.IOException;

public class Files_11 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        try {
            FileTime fileTime = Files.getLastModifiedTime(path);
            System.out.println("Last modified time: " + fileTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
