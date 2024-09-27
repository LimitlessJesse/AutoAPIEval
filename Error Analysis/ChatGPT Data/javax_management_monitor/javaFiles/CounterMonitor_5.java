import javax.management.monitor.CounterMonitor;

public class CounterMonitor_5 {
    public static void main(String[] args) {
        CounterMonitor counterMonitor = new CounterMonitor();
        counterMonitor.setDifferenceMode(true);
        System.out.println("Difference mode set to: " + counterMonitor.getDifferenceMode());
    }
}
