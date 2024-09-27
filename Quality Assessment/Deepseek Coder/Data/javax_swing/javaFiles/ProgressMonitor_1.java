import javax.swing.ProgressMonitor;
import javax.swing.JOptionPane;

public class ProgressMonitor_1 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Please wait...", "Loading data...", 0, 100);

        for (int i = 0; i <= 100; i++) {
            progressMonitor.setProgress(i);
            if (progressMonitor.isCanceled()) {
                JOptionPane.showMessageDialog(null, "Loading canceled by user.");
                break;
            }

            try {
                Thread.sleep(100); // Simulate loading data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!progressMonitor.isCanceled()) {
            JOptionPane.showMessageDialog(null, "Data loaded successfully.");
        }
    }
}
