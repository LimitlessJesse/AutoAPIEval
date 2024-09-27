import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Reader_2 {
    public static void main(String[] args) {
        try {
            Reader reader = new StringReader("Hello, World!");
            char[] buffer = new char[5];
            int numCharsRead = reader.read(buffer);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Data read: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
