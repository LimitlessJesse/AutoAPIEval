import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReader_2 {
    public static void main(String[] args) {
        try {
            Reader reader = new FilterReader(new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    // Your implementation here
                    return 0;
                }

                @Override
                public void close() throws IOException {
                    // Your implementation here
                }
            });

            char[] cbuf = new char[10];
            int off = 0;
            int len = 5;
            int read = reader.read(cbuf, off, len);
            System.out.println("Number of characters read: " + read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
