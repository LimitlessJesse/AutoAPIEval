import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_2 {
    public static void main(String[] args) {
        LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(System.in);
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = lineNumberInputStream.read(buffer, 0, buffer.length);
            System.out.println("Number of bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
