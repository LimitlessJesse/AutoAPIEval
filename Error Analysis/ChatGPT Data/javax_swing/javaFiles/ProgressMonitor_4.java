import javax.swing.ProgressMonitor;

public class ProgressMonitor_4 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "Processing...", 0, 100);
        // Perform some task
        progressMonitor.close();
    }
}
