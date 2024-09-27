import java.io.IOException;
import java.io.StringReader;

public class Reader_3 {
    public static void main(String[] args) {
        char[] cbuf = new char[5];
        int off = 0;
        int len = 5;
        
        StringReader reader = new StringReader("Hello");
        
        try {
            int numCharsRead = reader.read(cbuf, off, len);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: ");
            for (char c : cbuf) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
