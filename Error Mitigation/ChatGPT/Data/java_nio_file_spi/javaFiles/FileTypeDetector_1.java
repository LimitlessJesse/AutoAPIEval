import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.spi.FileTypeDetector;

public class FileTypeDetector_1 {
    public static void main(String[] args) {
        Path filePath = Path.of("example.txt");
        FileTypeDetector detector = new MyFileTypeDetector(); // Assuming MyFileTypeDetector is a custom implementation of FileTypeDetector
        try {
            String contentType = detector.probeContentType(filePath);
            System.out.println("Content Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static class MyFileTypeDetector extends FileTypeDetector {
        @Override
        public String probeContentType(Path path) throws IOException {
            // Custom implementation to probe the content type of the file
            return "text/plain"; // Example content type
        }
    }
}
