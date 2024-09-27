import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int character = reader.read();
            System.out.println("The read character is: " + (char) character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
