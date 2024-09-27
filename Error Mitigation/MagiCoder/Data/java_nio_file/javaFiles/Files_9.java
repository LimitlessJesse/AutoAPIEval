import java.nio.file.*;

public class Files_9 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        try {
            boolean isSymbolicLink = Files.isSymbolicLink(path);
            System.out.println("Is symbolic link: " + isSymbolicLink);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
