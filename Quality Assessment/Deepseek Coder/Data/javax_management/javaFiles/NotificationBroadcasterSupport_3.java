import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();

        // Create a new Notification
        Notification notification = new Notification(
                "Notification Type", 
                new java.util.Date(), 
                "Notification Message"
        );

        // Send the Notification
        broadcaster.sendNotification(notification);
    }
}
