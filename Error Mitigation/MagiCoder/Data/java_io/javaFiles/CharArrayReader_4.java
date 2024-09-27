import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_4 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(array);

        try {
            // Skip 2 characters
            long skipped = reader.skip(2);
            System.out.println("Skipped " + skipped + " characters");

            // Read the next character
            int read = reader.read();
            System.out.println("Read character: " + (char) read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
