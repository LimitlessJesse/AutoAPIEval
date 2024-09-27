import javax.swing.ProgressMonitor;

public class ProgressMonitor_2 {
    public static void main(String[] args) {
        ProgressMonitor monitor = new ProgressMonitor(null, "Monitoring Progress", "Task", 0, 100);
        monitor.setMinimum(0);
        int min = monitor.getMinimum();
        System.out.println("Minimum value: " + min);
    }
}
