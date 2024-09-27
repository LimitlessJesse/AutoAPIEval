import javax.management.monitor.GaugeMonitor;

public class GaugeMonitor_2 {
    public static void main(String[] args) {
        // Create a new GaugeMonitor
        GaugeMonitor monitor = new GaugeMonitor();

        // Perform operations with the monitor

        // Stop monitoring
        monitor.stop();
    }
}
