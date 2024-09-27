import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;

public class ProgressMonitor_4 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Please wait...", "", 0, 100);
        progressMonitor.setMillisToPopup(5000);

        for (int i = 0; i <= 100; i++) {
            progressMonitor.setProgress(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(null, "Task completed!");
    }
}
