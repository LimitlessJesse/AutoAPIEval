import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_4 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        CharArrayReader reader = new CharArrayReader(charArray);

        try {
            reader.close();
            System.out.println("Stream closed successfully.");
        } catch (IOException e) {
            System.out.println("Error closing stream: " + e.getMessage());
        }
    }
}
