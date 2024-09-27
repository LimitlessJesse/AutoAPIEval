import javax.swing.ProgressMonitorInputStream;
import java.io.IOException;

public class ProgressMonitorInputStream_2 {
    public static void main(String[] args) {
        ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null, "Reading Progress", System.in);
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
