import javax.swing.ProgressMonitorInputStream;
import java.io.IOException;

public class ProgressMonitorInputStream_1 {
    public static void main(String[] args) {
        ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null, "Reading Progress", System.in);
        try {
            int data = inputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
