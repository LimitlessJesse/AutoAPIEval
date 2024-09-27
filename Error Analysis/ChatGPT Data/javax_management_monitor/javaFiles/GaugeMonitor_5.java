import javax.management.monitor.GaugeMonitor;

public class GaugeMonitor_5 {
    public static void main(String[] args) {
        GaugeMonitor monitor = new GaugeMonitor();
        monitor.setThresholds(100, 50);
        // Add any additional monitoring logic here
    }
}
