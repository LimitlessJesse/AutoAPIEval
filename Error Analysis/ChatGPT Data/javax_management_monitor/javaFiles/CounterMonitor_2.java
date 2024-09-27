import javax.management.monitor.CounterMonitor;

public class CounterMonitor_2 {
    public static void main(String[] args) {
        CounterMonitor monitor = new CounterMonitor();
        int threshold = monitor.getThreshold();
        System.out.println("Threshold: " + threshold);
    }
}
