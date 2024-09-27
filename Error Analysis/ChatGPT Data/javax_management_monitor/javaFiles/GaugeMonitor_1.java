import javax.management.monitor.GaugeMonitor;

public class GaugeMonitor_1 {
    public static void main(String[] args) {
        // Create a GaugeMonitor object
        GaugeMonitor monitor = new GaugeMonitor();

        // Use the start() method to start monitoring
        monitor.start();
    }
}
