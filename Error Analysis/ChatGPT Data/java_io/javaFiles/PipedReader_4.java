import java.io.PipedReader;
import java.io.IOException;

public class PipedReader_4 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            boolean isReady = reader.ready();
            System.out.println("Is ready: " + isReady);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
