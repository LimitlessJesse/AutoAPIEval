import javax.swing.ProgressMonitorInputStream;
import java.io.IOException;

public class ProgressMonitorInputStream_5 {
    public static void main(String[] args) {
        ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null, "Reading", System.in);
        
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
