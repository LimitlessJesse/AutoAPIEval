import java.io.IOException;
import java.io.StringReader;

public class StringReader_3 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringReader reader = new StringReader(str);
        char[] cbuf = new char[10];
        try {
            int numCharsRead = reader.read(cbuf, 0, 10);
            if (numCharsRead!= -1) {
                System.out.println(new String(cbuf, 0, numCharsRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
