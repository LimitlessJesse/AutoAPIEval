import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader_8 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Reader reader = new StringReader(str);

        try {
            // Read a character
            int c = reader.read();
            System.out.println((char) c);

            // Mark the position
            reader.mark(100);

            // Read another character
            c = reader.read();
            System.out.println((char) c);

            // Reset the position
            reader.reset();

            // Read the character again
            c = reader.read();
            System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
