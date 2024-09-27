import javax.management.Notification;
import javax.management.NotificationFilterSupport;

public class NotificationFilterSupport_3 {
    public static void main(String[] args) {
        // Create a NotificationFilterSupport object
        NotificationFilterSupport filter = new NotificationFilterSupport();

        // Check if notification is enabled
        boolean isNotificationEnabled = filter.isNotificationEnabled(new Notification("Type", new Object(), 1));
        System.out.println("Is notification enabled? " + isNotificationEnabled);
    }
}
