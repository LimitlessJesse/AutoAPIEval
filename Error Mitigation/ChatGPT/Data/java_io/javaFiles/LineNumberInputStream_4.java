import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_4 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
        
        try {
            int bytesAvailable = inputStream.available();
            System.out.println("Bytes available to read: " + bytesAvailable);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
