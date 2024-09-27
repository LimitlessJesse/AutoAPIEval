import javax.swing.ProgressMonitor;

public class ProgressMonitor_6 {
    public static void main(String[] args) {
        ProgressMonitor monitor = new ProgressMonitor(null, "Monitoring Progress", "Progress", 0, 100);
        monitor.setProgress(50);
        monitor.close();
    }
}
