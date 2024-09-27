import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            System.out.println("Enter a character:");
            int character = reader.read();
            System.out.println("The character you entered is: " + (char)character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
