import java.io.StringReader;
import java.io.IOException;

public class StringReader_2 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        char[] buffer = new char[5];
        try {
            int numCharsRead = reader.read(buffer, 0, 5);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: ");
            for (char c : buffer) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
