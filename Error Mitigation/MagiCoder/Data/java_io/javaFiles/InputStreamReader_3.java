import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_3 {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            System.out.println("Is the stream ready? " + reader.ready());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
