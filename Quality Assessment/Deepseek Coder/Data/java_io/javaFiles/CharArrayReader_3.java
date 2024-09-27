import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_3 {
    public static void main(String[] args) {
        char[] arr = { 'd', 'e', 'c', 'a', 'f', 'e' };
        CharArrayReader reader = new CharArrayReader(arr);
        try {
            System.out.println("Skipped: " + reader.skip(3));
            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
