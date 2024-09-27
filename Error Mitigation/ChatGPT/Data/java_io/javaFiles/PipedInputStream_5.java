import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_5 {
    public static void main(String[] args) {
        try {
            PipedInputStream pipedInputStream = new PipedInputStream();
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
