import java.io.InputStream;
import java.io.IOException;

public class InputStream_3 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            long bytesSkipped = inputStream.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
