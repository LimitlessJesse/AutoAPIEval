import javax.swing.ProgressMonitorInputStream;
import java.io.IOException;

public class ProgressMonitorInputStream_3 {
    public static void main(String[] args) {
        ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null, null);
        try {
            long bytesSkipped = inputStream.skip(10);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
