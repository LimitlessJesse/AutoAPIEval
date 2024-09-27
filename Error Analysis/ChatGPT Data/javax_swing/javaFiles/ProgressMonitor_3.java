import javax.swing.ProgressMonitor;

public class ProgressMonitor_3 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "Initializing...", 0, 100);
        progressMonitor.setNote("Processing data...");
    }
}
