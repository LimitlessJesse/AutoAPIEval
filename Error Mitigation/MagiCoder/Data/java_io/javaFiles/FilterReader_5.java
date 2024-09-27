import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReader_5 {
    public static void main(String[] args) {
        try {
            FilterReader reader = new FilterReader(new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {
                    System.out.println("Closing the reader");
                }
            });

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
