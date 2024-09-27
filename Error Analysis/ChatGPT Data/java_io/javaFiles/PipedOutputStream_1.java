import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_1 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            int b = 65; // ASCII value of character 'A'
            pipedOutputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
