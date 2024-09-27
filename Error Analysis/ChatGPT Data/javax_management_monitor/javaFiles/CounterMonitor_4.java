import javax.management.monitor.CounterMonitor;

public class CounterMonitor_4 {
    public static void main(String[] args) {
        CounterMonitor counterMonitor = new CounterMonitor();
        long offset = counterMonitor.getOffset();
        System.out.println("Offset: " + offset);
    }
}
