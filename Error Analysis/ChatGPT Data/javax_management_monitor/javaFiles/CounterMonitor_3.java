import javax.management.monitor.CounterMonitor;

public class CounterMonitor_3 {
    public static void main(String[] args) {
        CounterMonitor counterMonitor = new CounterMonitor();
        // Set offset to a specific value
        counterMonitor.setOffset(100);
        // Printing the offset value
        System.out.println("Offset is set to: " + counterMonitor.getOffset());
    }
}
