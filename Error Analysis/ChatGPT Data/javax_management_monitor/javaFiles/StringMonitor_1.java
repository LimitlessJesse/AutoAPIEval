import javax.management.monitor.StringMonitor;

public class StringMonitor_1 {
    public static void main(String[] args) {
        StringMonitor monitor = new StringMonitor();
        String result = monitor.getDerivedGauge();
        System.out.println("Derived Gauge: " + result);
    }
}
