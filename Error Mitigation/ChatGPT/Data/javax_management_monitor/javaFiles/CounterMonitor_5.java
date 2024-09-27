import javax.management.monitor.CounterMonitor;

public class CounterMonitor_5 {
    public static void main(String[] args) {
        CounterMonitor counterMonitor = new CounterMonitor();
        boolean differenceMode = true;
        counterMonitor.setDifferenceMode(differenceMode);
    }
}
