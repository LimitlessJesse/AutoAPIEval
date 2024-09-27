import javax.swing.ProgressMonitor;

public class ProgressMonitor_5 {
    public static void main(String[] args) {
        ProgressMonitor monitor = new ProgressMonitor(null, "Copying files", "Copying...", 0, 100);
        monitor.setNote("Copying file1.txt");
    }
}
