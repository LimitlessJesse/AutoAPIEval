import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterWriter_4 {
    public static void main(String[] args) {
        try {
            Writer writer = new FilterWriter(new Writer() {
                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {
                    // Implementation not needed for this example
                }

                @Override
                public void flush() throws IOException {
                    // Implementation not needed for this example
                }

                @Override
                public void close() throws IOException {
                    // Implementation of close method
                    System.out.println("Closing the writer");
                }
            });

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
