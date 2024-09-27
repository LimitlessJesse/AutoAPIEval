import javax.management.monitor.MonitorNotification;

public class MonitorNotification_2 {
    public static void main(String[] args) {
        MonitorNotification notification = new MonitorNotification("NotificationType", this, 1, 2, "Notification message", "UserData");
        Object derivedGauge = notification.getDerivedGauge();
        System.out.println("Derived Gauge: " + derivedGauge);
    }
}
