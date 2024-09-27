import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class FilterInputStream_4 {
    public static void main(String[] args) {
        // Create a FilterInputStream object
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        FilterInputStream filterInputStream = new FilterInputStream(inputStream) {
        };

        try {
            // Skip 5 bytes from the input stream
            long bytesSkipped = filterInputStream.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
