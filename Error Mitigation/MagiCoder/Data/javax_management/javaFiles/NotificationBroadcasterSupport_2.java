import javax.management.*;

public class NotificationBroadcasterSupport_2 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();

        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(Notification notification, Object handback) {
                System.out.println("Notification received: " + notification);
            }
        };

        broadcaster.addNotificationListener(listener, null, null);

        try {
            broadcaster.removeNotificationListener(listener);
        } catch (ListenerNotFoundException e) {
            e.printStackTrace();
        }
    }
}
