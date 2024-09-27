import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            FileImageOutputStream imageOutputStream = new FileImageOutputStream(file);
            int b = 65; // ASCII value of 'A'
            imageOutputStream.write(b);
            imageOutputStream.close();
            System.out.println("Byte '" + (char) b + "' has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
