import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_4 {
    public static void main(String[] args) {
        try {
            SequenceInputStream sis = new SequenceInputStream(null, null);
            sis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
