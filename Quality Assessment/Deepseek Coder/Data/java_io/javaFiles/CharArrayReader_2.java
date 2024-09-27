import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_2 {
    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        CharArrayReader reader = new CharArrayReader(arr);
        int len = arr.length;
        char[] cbuf = new char[len];
        try {
            int numCharsRead = reader.read(cbuf, 0, len);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: " + new String(cbuf));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
