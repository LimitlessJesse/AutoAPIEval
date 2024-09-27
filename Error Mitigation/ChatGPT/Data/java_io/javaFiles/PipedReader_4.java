import java.io.IOException;
import java.io.PipedReader;

public class PipedReader_4 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            boolean isReady = reader.ready();
            System.out.println("Is the stream ready to be read? " + isReady);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
