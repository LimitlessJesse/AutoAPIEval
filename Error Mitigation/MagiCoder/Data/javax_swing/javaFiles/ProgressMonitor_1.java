import javax.swing.ProgressMonitor;

public class ProgressMonitor_1 {
    public static void main(String[] args) {
        ProgressMonitor monitor = new ProgressMonitor(null, "Progress", "Task", 0, 100);
        monitor.setMaximum(100);
        System.out.println("Maximum value: " + monitor.getMaximum());
    }
}
