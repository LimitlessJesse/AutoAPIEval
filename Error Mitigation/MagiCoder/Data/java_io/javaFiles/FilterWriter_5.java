import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterWriter_5 {
    public static void main(String[] args) {
        try {
            Writer writer = new FilterWriter(new Writer() {
                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {
                    // Implementation of write method
                }

                @Override
                public void flush() throws IOException {
                    // Implementation of flush method
                }

                @Override
                public void close() throws IOException {
                    // Implementation of close method
                }
            });

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
