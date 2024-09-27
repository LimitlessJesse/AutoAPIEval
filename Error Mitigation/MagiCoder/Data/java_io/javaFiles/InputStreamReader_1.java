import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            int character = reader.read();
            System.out.println("Character read: " + (char) character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
