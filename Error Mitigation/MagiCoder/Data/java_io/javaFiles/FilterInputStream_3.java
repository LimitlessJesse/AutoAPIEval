import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_3 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FilterInputStream(null) {
                @Override
                public int read(byte[] b, int off, int len) throws IOException {
                    return super.read(b, off, len);
                }
            };

            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
