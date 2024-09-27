import javax.management.NotificationListener;
import javax.management.NotificationFilter;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                System.out.println("Received notification: " + notification.getMessage());
            }
        };
        
        NotificationFilter filter = null; // Set your filter if needed
        
        Object handback = null; // Set any object you want to pass back when notification is triggered
        
        broadcaster.addNotificationListener(listener, filter, handback);
        
        // Trigger a notification to test
        broadcaster.sendNotification(new javax.management.Notification("Sample Notification", broadcaster, 1));
    }
}
