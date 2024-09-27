import java.io.*;

public class PushbackReader_9 {
    public static void main(String[] args) {
        try {
            // Create a PushbackReader
            PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"));

            // Read a character
            int c = reader.read();

            // Push back the character
            reader.unread(c);

            // Read the character again
            c = reader.read();

            // Print the character
            System.out.println((char) c);

            // Close the reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
