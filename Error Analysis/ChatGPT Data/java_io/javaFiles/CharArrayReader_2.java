import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_2 {
    public static void main(String[] args) {
        char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(cbuf);

        char[] buffer = new char[3];
        int off = 1;
        int len = 3;

        try {
            int bytesRead = reader.read(buffer, off, len);
            System.out.println("Number of characters read: " + bytesRead);
            
            for (char c : buffer) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
