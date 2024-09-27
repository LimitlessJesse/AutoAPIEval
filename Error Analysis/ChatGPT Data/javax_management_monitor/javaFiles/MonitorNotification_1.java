import javax.management.monitor.MonitorNotification;

public class MonitorNotification_1 {
    public static void main(String[] args) {
        MonitorNotification notification = new MonitorNotification("notificationType", this, 1, 2, "Observed attribute is: attribute");
        String observedAttribute = notification.getObservedAttribute();
        System.out.println("Observed Attribute: " + observedAttribute);
    }
}
