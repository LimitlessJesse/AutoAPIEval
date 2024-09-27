import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;

public class CharArrayWriter_6 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write("Hello, World!");
            writer.writeTo(new Writer() {
                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {
                    System.out.println(new String(cbuf, off, len));
                }

                @Override
                public void flush() throws IOException {
                }

                @Override
                public void close() throws IOException {
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
