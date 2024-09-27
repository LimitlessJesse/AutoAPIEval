import java.io.IOException;
import java.io.Writer;

public class Writer_1 {
    public static void main(String[] args) {
        try {
            Writer writer = new Writer() {
                @Override
                public void write(int c) throws IOException {
                    System.out.print((char) c);
                }

                @Override
                public void flush() throws IOException {
                }

                @Override
                public void close() throws IOException {
                }
            };

            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
