import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationListener;
import javax.management.NotificationFilter;

public class NotificationBroadcasterSupport_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                System.out.println("Received notification: " + notification.getMessage());
            }
        };
        
        NotificationFilter filter = null;
        Object handback = "Handback object";
        
        broadcaster.addNotificationListener(listener, filter, handback);
    }
}
