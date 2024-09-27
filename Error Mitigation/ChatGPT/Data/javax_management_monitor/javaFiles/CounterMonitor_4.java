import javax.management.monitor.CounterMonitorMBean;

public class CounterMonitor_4 {
    public static void main(String[] args) {
        CounterMonitorMBean monitor = new CounterMonitorMBean() {
            @Override
            public boolean getNotify() {
                // Implement the logic to get the notification's on/off switch value
                return true; // For example, always return true
            }
        };
        
        boolean notifyValue = monitor.getNotify();
        System.out.println("Notification value: " + notifyValue);
    }
}
