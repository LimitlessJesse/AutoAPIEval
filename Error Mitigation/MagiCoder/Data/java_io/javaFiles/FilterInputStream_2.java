import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_2 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FilterInputStream(System.in) {
                @Override
                public int read(byte[] b) throws IOException {
                    return super.read(b);
                }
            };

            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);

            if (bytesRead!= -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
