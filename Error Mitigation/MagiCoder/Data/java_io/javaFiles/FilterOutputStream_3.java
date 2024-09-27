import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_3 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FilterOutputStream(System.out) {
                @Override
                public void write(byte[] b) throws IOException {
                    super.write(b, 0, b.length);
                }
            };
            outputStream.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
