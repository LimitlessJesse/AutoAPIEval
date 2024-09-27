import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_4 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FilterOutputStream(System.out) {
                @Override
                public void write(byte[] b, int off, int len) throws IOException {
                    super.write(b, off, len);
                }
            };

            byte[] bytes = "Hello, World!".getBytes();
            outputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
