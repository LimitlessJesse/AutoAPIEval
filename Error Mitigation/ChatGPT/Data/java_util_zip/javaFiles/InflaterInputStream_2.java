import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_2 {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1024];
            InflaterInputStream inflater = new InflaterInputStream(System.in);
            int bytesRead = inflater.read(buffer, 0, buffer.length);
            
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
