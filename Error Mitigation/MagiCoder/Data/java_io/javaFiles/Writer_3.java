import java.io.IOException;
import java.io.Writer;

public class Writer_3 {
    public static void main(String[] args) {
        try {
            Writer writer = new Writer() {
                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {
                    // Implement your own logic here
                    for (int i = off; i < off + len; i++) {
                        System.out.print(cbuf[i]);
                    }
                }

                @Override
                public void flush() throws IOException {
                    // Implement your own logic here
                }

                @Override
                public void close() throws IOException {
                    // Implement your own logic here
                }
            };

            char[] chars = {'H', 'e', 'l', 'l', 'o'};
            writer.write(chars, 0, chars.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
