import java.io.IOException;
import java.io.InputStream;

public class InputStream_3 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            if (bytesRead!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                System.out.println("Data: " + new String(buffer, 0, bytesRead));
            } else {
                System.out.println("End of stream reached");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
