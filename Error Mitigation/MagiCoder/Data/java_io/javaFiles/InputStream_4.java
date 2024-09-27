import java.io.IOException;
import java.io.InputStream;

public class InputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }

                @Override
                public long skip(long n) throws IOException {
                    if (n < 0) {
                        return 0;
                    }
                    long remaining = n;
                    while (remaining > 0) {
                        int nr = read();
                        if (nr < 0) {
                            break;
                        }
                        remaining--;
                    }
                    return n - remaining;
                }
            };

            long skippedBytes = inputStream.skip(10);
            System.out.println("Skipped " + skippedBytes + " bytes.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
