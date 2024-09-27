import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_3 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        int bytesRead = 0;
        
        try {
            FilterInputStream fis = new FilterInputStream(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            });
            
            bytesRead = fis.read(buffer, 0, buffer.length);
            
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Bytes read: " + bytesRead);
    }
}
