import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            FilterInputStream filterIS = new FilterInputStream(fis) {
                public long skip(long n) throws IOException {
                    int bytesSkipped = 0;
                    while (bytesSkipped < n) {
                        int skip = in.read();
                        if (skip < 0) {
                            break; // EOF
                        }
                        bytesSkipped++;
                    }
                    return bytesSkipped;
                }
            };

            // Skip 5 bytes
            long bytesSkipped = filterIS.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);

            // Read the next byte
            int nextByte = filterIS.read();
            System.out.println("Next byte: " + (char) nextByte);

            filterIS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
