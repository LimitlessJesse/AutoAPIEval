import javax.swing.ProgressMonitor;

public class ProgressMonitor_3 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "", 0, 100);
        progressMonitor.setMillisToPopup(5000); // Set the time in milliseconds for the popup to appear
    }
}
