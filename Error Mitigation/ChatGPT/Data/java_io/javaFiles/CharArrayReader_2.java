import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_2 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(charArray);
        
        char[] buffer = new char[3];
        int offset = 0;
        int length = 3;
        
        try {
            int numCharsRead = reader.read(buffer, offset, length);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: ");
            for (char c : buffer) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
