import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStream_2 {
    public static void main(String[] args) {
        try {
            FilterInputStream fis = new FilterInputStream(System.in) {
                @Override
                public int read(byte[] b) throws IOException {
                    return super.read(b);
                }
            };
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
