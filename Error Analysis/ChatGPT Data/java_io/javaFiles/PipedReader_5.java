import java.io.IOException;
import java.io.PipedReader;

public class PipedReader_5 {
    public static void main(String[] args) {
        PipedReader reader = new PipedReader();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
