import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_5 {
    public static void main(String[] args) {
        void sendNotification(Notification notification) {
            // Implement your logic here
        }

        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        Notification notification = new Notification("EventType", broadcaster, 1);
        broadcaster.sendNotification(notification);
    }
}
