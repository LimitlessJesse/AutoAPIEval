import java.io.IOException;
import java.io.StringReader;

public class Reader_2 {
    public static void main(String[] args) {
        try {
            StringReader reader = new StringReader("Hello, World!");
            char[] buffer = new char[5];
            int numCharsRead = reader.read(buffer);
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
