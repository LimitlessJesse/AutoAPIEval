import java.io.IOException;
import java.io.Reader;

public class Reader_3 {
    public static void main(String[] args) {
        try {
            Reader reader = new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    // Your implementation here
                    return 0;
                }
            };
            char[] cbuf = new char[10];
            int off = 0;
            int len = 5;
            int numCharsRead = reader.read(cbuf, off, len);
            System.out.println("Number of characters read: " + numCharsRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
