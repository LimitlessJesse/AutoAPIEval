import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_5 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        PushbackReader reader = new PushbackReader(new StringReader(data));

        try {
            int c = reader.read();
            while (c!= -1) {
                if ((char) c == 'W') {
                    reader.unread('W');
                    c = reader.read();
                    System.out.print((char) c);
                    c = reader.read();
                } else {
                    System.out.print((char) c);
                    c = reader.read();
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
