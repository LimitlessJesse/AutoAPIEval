import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_2 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new CheckedInputStream(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            }, new Checksum() {
                @Override
                public void update(int b) {
                }

                @Override
                public long getValue() {
                    return 0;
                }

                @Override
                public void reset() {
                }
            });

            int readByte = inputStream.read();
            System.out.println(readByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
