import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_1 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        Notification notification = new Notification("test", this, 1);
        broadcaster.sendNotification(notification);
    }
}
