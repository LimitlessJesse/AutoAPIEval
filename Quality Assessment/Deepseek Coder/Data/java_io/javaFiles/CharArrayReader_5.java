import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_5 {
    public static void main(String[] args) {
        CharArrayReader reader = new CharArrayReader(new char[]{'H', 'e', 'l', 'l', 'o'});
        int i;
        try {
            while ((i = reader.read())!= -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
