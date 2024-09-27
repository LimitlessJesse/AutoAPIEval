import java.io.IOException;
import java.io.Writer;

public class Writer_4 {
    public static void main(String[] args) {
        try {
            Writer writer = new Writer() {
                @Override
                public void write(String str) throws IOException {
                    System.out.println(str);
                }

                @Override
                public void flush() throws IOException {
                }

                @Override
                public void close() throws IOException {
                }
            };

            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
