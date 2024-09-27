import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_4 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            reader.close();
            System.out.println("InputStreamReader closed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while closing the InputStreamReader: " + e.getMessage());
        }
    }
}
