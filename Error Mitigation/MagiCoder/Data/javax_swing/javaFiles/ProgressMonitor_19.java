import javax.swing.ProgressMonitor;

public class ProgressMonitor_19 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "Task", 0, 100);
        progressMonitor.setMillisToPopup(5000);
    }
}
