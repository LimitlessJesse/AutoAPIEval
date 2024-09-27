import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_3 {
    public static void main(String[] args) {
        try {
            String str = "Hello World";
            char[] cbuf = new char[str.length()];
            str.getChars(0, str.length(), cbuf, 0);
            
            PushbackReader reader = new PushbackReader(new StringReader(str));
            reader.unread(cbuf, 6, 5);
            
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
