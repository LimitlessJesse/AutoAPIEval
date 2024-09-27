import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_2 {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        CharArrayReader reader = new CharArrayReader(array);

        try {
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
