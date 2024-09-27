import javax.management.monitor.CounterMonitor;

public class CounterMonitor_1 {
    public static void main(String[] args) {
        CounterMonitor counterMonitor = new CounterMonitor();
        counterMonitor.setThreshold(100);
        System.out.println("Threshold set to: " + counterMonitor.getThreshold());
    }
}
