import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_3 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            pos.write(65); // 'A'
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
