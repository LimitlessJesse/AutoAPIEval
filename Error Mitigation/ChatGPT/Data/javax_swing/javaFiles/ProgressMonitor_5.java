import javax.swing.ProgressMonitor;

public class ProgressMonitor_5 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Operation in progress", "", 0, 100);
        
        // Perform some operation
        
        progressMonitor.setProgress(100);
        progressMonitor.close();
    }
}
