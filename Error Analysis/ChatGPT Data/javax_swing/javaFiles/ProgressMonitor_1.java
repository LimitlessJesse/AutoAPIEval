import javax.swing.ProgressMonitor;

public class ProgressMonitor_1 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "", 0, 100);
        progressMonitor.setProgress(50);
    }
}
