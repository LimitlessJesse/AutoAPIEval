import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_5 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        CharArrayReader reader = new CharArrayReader(array);

        try {
            System.out.println(reader.ready());  // Output: true
            reader.read();  // Read the first character
            System.out.println(reader.ready());  // Output: true
            reader.read();  // Read the second character
            System.out.println(reader.ready());  // Output: true
            reader.read();  // Read the third character
            System.out.println(reader.ready());  // Output: false
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
