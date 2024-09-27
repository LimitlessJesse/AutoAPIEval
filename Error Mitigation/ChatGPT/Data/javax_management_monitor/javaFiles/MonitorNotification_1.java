import javax.management.monitor.MonitorNotification;

public class MonitorNotification_1 {
    public static void main(String[] args) {
        MonitorNotification monitorNotification = new MonitorNotification("NotificationType", this, 1, 2, "Notification message", "ObservedAttribute");
        String observedAttribute = monitorNotification.getObservedAttribute();
        System.out.println("Observed Attribute: " + observedAttribute);
    }
}
