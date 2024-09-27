import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        Notification notification = new Notification("Test", this, 0, "Test Notification");
        broadcaster.sendNotification(notification);
    }
}
