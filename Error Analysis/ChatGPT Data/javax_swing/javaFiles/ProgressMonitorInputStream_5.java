import javax.swing.ProgressMonitorInputStream;

public class ProgressMonitorInputStream_5 {
    public static void main(String[] args) {
        try {
            ProgressMonitorInputStream stream = new ProgressMonitorInputStream(null, "Downloading", System.in);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
