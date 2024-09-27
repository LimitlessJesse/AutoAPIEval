import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationListener;
import javax.management.NotificationFilter;
import javax.management.ListenerNotFoundException;

public class NotificationBroadcasterSupport_2 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        
        // Add a listener
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                System.out.println("Received notification: " + notification.getMessage());
            }
        };
        NotificationFilter filter = null;
        Object handback = null;
        broadcaster.addNotificationListener(listener, filter, handback);
        
        // Remove the listener
        try {
            broadcaster.removeNotificationListener(listener, filter, handback);
        } catch (ListenerNotFoundException e) {
            System.out.println("Listener not found: " + e.getMessage());
        }
    }
}
