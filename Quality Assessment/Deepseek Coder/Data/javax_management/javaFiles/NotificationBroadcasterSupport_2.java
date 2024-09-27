import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationListener;

public class NotificationBroadcasterSupport_2 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();

        // Create a listener
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(Notification notification, Object handback) {
                System.out.println("Received notification: " + notification);
            }
        };

        // Add the listener
        broadcaster.addNotificationListener(listener, null, null);

        // Send a notification
        broadcaster.sendNotification(new Notification("Test", "Source", 0));

        // Remove the listener
        broadcaster.removeNotificationListener(listener);
    }
}
