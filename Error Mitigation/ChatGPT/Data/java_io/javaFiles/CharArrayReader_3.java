import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_3 {
    public static void main(String[] args) {
        try {
            char[] charArray = {'a', 'b', 'c'};
            CharArrayReader reader = new CharArrayReader(charArray);
            
            if(reader.ready()) {
                int data = reader.read();
                System.out.println((char)data);
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
