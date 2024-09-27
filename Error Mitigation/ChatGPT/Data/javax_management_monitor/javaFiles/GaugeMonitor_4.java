import javax.management.monitor.GaugeMonitor;

public class GaugeMonitor_4 {
    public static void main(String[] args) {
        GaugeMonitor monitor = new GaugeMonitor();
        monitor.setNotifyHigh(true);
    }
}
