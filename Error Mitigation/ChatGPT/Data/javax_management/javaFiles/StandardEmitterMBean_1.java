import javax.management.NotificationListener;
import javax.management.NotificationFilter;
import javax.management.StandardEmitterMBean;

public class StandardEmitterMBean_1 {
    public static void main(String[] args) {
        StandardEmitterMBean mbean = new StandardEmitterMBean();
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                System.out.println("Received notification: " + notification.getMessage());
            }
        };
        NotificationFilter filter = null;
        Object handback = new Object();
        
        mbean.addNotificationListener(listener, filter, handback);
    }
}
