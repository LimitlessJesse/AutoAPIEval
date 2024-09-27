import java.nio.file.*;

public class Files_4 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("sourceFile.txt");
        Path target = Paths.get("targetFile.txt");

        Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
