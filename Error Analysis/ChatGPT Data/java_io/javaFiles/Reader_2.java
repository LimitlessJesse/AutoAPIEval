import java.io.IOException;
import java.io.StringReader;

public class Reader_2 {
    public static void main(String[] args) {
        char[] cbuf = new char[5];
        StringReader reader = new StringReader("Hello");
        try {
            int numChars = reader.read(cbuf);
            System.out.println("Number of characters read: " + numChars);
            System.out.println("Characters read: ");
            for (char c : cbuf) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
