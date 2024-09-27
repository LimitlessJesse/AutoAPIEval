import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_4 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void sendNotification(Notification notification) {
                // Implementation not required for this example
            }
        };

        Notification notification = new Notification("Notification", broadcaster, 0);
        long timestamp = notification.getTimeStamp();

        System.out.println("Timestamp: " + timestamp);
    }
}
