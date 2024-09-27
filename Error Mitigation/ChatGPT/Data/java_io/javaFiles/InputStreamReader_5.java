import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_5 {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            boolean isReady = reader.ready();
            System.out.println("Is ready to read: " + isReady);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
