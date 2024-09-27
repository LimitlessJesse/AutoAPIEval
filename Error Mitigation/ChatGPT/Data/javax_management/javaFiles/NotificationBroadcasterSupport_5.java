import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationListener;
import javax.management.ListenerNotFoundException;

public class NotificationBroadcasterSupport_5 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                // Handle notification
            }
        };
        
        try {
            broadcaster.removeNotificationListener(listener);
        } catch (ListenerNotFoundException e) {
            e.printStackTrace();
        }
    }
}
