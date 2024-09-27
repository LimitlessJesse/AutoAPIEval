import java.nio.file.*;

public class Files_24 {
    public static void main(String[] args) throws IOException {
        Path existing = Paths.get("existingFile.txt");
        Path link = Paths.get("link.txt");

        Files.createLink(link, existing);
    }
}
