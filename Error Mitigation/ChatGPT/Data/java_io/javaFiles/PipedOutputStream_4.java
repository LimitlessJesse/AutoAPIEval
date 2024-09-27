import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_4 {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
