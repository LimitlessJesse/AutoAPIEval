import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReader_4 {
    public static void main(String[] args) {
        try {
            FilterReader reader = new FilterReader(new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {

                }
            }) {
                @Override
                public boolean ready() throws IOException {
                    return super.ready();
                }
            };

            System.out.println(reader.ready());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
