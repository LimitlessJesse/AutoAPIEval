import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReader_1 {
    public static void main(String[] args) {
        FilterReader filterReader = new FilterReader(new Reader() {
            @Override
            public int read() throws IOException {
                return 0;
            }

            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {
                
            }
        });
    }
}
