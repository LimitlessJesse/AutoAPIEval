import java.io.InputStream;
import java.io.IOException;

public class InputStream_5 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            // Code to open an input stream
            inputStream = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            
            // Code to read from the input stream
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
