import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_2 {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            int byteToWrite = 65; // ASCII value for 'A'
            output.write(byteToWrite);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
