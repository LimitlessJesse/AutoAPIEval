import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FilterInputStream(null) {
                @Override
                public int read() throws IOException {
                    return 0;
                }

                @Override
                public long skip(long n) throws IOException {
                    return super.skip(n);
                }
            };

            long bytesSkipped = inputStream.skip(10);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
