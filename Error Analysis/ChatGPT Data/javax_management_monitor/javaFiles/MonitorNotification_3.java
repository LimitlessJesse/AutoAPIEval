import javax.management.monitor.MonitorNotification;

public class MonitorNotification_3 {
    public static void main(String[] args) {
        MonitorNotification notification = new MonitorNotification("notificationType", this, 0, System.currentTimeMillis(), "message", null, null, null);
        Object derivedGauge = notification.getDerivedGauge();
        System.out.println("Derived Gauge: " + derivedGauge);
    }
}
