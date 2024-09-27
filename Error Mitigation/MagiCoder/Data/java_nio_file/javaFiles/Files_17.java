import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class Files_17 {
    public static void main(String[] args) {
        Path start = Paths.get("."); // replace with your starting path
        try {
            Stream<Path> paths = Files.walk(start);
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
