import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_2 {
    public static void main(String[] args) {
        File file = new File("example.jpg");
        try (FileImageOutputStream outputStream = new FileImageOutputStream(file)) {
            int b = 65; // Example byte value
            outputStream.write(b);
            System.out.println("Byte " + b + " has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
