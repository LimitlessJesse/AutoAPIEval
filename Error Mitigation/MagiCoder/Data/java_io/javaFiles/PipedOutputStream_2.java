import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_2 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            pos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
