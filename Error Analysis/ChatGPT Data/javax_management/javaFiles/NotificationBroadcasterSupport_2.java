import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_2 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        
        MyNotificationListener listener = new MyNotificationListener();
        broadcaster.addNotificationListener(listener, null, null);
        
        broadcaster.removeNotificationListener(listener);
    }
}

class MyNotificationListener implements NotificationListener {
    // Implement notification handling logic
}
