import java.io.IOException;
import java.io.Reader;

public class Reader_4 {
    public static void main(String[] args) {
        try {
            Reader reader = new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {

                }
            };

            long n = 10; // number of characters to skip
            long skipped = reader.skip(n);
            System.out.println("Skipped " + skipped + " characters.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
