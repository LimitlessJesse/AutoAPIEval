import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class FilterInputStream_5 {
    public static void main(String[] args) {
        // Create a FilterInputStream object
        FilterInputStream in = new FilterInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        }) {
            @Override
            public int available() throws IOException {
                return super.available();
            }
        };

        try {
            // Get an estimate of the number of bytes that can be read
            int bytesAvailable = in.available();
            System.out.println("Bytes available: " + bytesAvailable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
