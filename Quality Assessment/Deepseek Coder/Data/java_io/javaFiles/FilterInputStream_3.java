import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_3 {
    public static void main(String[] args) {
        InputStream inputStream = new FilterInputStream(System.in) {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                // Your implementation here
                return super.read(b, off, len);
            }
        };

        try {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Content: " + new String(buffer, 0, bytesRead));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
