import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Reader_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Reader reader = new StringReader(str);
        char[] cbuf = new char[str.length()];

        try {
            int numCharsRead = reader.read(cbuf);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Content read: " + new String(cbuf));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
