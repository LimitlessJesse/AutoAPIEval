import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterWriter_2 {
    public static void main(String[] args) {
        FilterWriter filterWriter = new FilterWriter(new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                // Implement your custom logic here
            }

            @Override
            public void close() throws IOException {
                // Implement close method if needed
            }

            @Override
            public void flush() throws IOException {
                // Implement flush method if needed
            }
        });
        
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        try {
            filterWriter.write(cbuf, 0, 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
