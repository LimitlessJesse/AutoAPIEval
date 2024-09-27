import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedOutputStream_3 {
    public static void main(String[] args) {
        PipedOutputStream outputStream = new PipedOutputStream();
        try {
            outputStream.write(65); // ASCII value of 'A'
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
