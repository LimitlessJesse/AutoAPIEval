import java.io.InputStream;
import java.io.IOException;

public class InputStream_1 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        try {
            System.out.println("Enter a character:");
            int data = inputStream.read();
            System.out.println("You entered: " + (char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
