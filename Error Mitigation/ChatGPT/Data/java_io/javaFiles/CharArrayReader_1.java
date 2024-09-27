import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_1 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        CharArrayReader reader = new CharArrayReader(charArray);
        
        try {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.println((char) charRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
