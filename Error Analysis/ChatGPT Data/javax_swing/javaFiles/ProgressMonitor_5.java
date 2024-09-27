import javax.swing.ProgressMonitor;

public class ProgressMonitor_5 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "", 0, 100);
        int millisToDecideToPopup = 5000; // 5 seconds
        progressMonitor.setMillisToDecideToPopup(millisToDecideToPopup);
    }
}
