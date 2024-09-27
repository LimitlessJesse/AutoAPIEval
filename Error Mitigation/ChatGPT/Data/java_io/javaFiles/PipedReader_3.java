import java.io.IOException;
import java.io.PipedReader;

public class PipedReader_3 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            char[] buffer = new char[10];
            int bytesRead = reader.read(buffer, 0, 5);
            System.out.println("Number of characters read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
