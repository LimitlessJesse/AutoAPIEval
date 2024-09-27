import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_4 {
    public static void main(String[] args) {
        try {
            String str = "Hello World";
            PushbackReader reader = new PushbackReader(new StringReader(str));
            
            int c = reader.read(); // read the first character
            System.out.println((char) c); // output: H
            
            reader.unread(c); // push back the character
            
            c = reader.read(); // read the character again
            System.out.println((char) c); // output: H
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
