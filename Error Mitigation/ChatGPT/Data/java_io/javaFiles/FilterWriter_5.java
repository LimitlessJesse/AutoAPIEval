import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterWriter_5 {
    public static void main(String[] args) {
        FilterWriter filterWriter = new FilterWriter(new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                // implementation of write method
            }

            @Override
            public void flush() throws IOException {
                // implementation of flush method
            }

            @Override
            public void close() throws IOException {
                // implementation of close method
            }
        });

        try {
            filterWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
