import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_2 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
        byte[] buffer = new byte[1024];
        int bytesRead;
        try {
            bytesRead = inputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
