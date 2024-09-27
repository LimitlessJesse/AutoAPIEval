import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        PushbackReader reader = new PushbackReader(new StringReader(input));
        char[] buffer = new char[5];
        try {
            int numberOfCharsRead = reader.read(buffer, 0, buffer.length);
            System.out.println("Number of characters read: " + numberOfCharsRead);
            System.out.println("Characters read: " + new String(buffer));
            
            // Push back two characters
            reader.unread(' ');
            reader.unread('W');
            
            // Read again
            numberOfCharsRead = reader.read(buffer, 0, buffer.length);
            System.out.println("Number of characters read after push back: " + numberOfCharsRead);
            System.out.println("Characters read after push back: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
