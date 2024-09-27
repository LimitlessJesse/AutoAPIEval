import javax.swing.ProgressMonitor;

public class ProgressMonitor_2 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress", "", 0, 100);
        progressMonitor.setMillisToDecideToPopup(1000);
    }
}
