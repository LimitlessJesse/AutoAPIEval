import java.io.IOException;
import java.io.StringReader;

public class Reader_1 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("12345");
        try {
            int number = reader.read();
            System.out.println("Read number: " + number);
        } catch (IOException e) {
            System.out.println("An error occurred while reading");
        }
    }
}
