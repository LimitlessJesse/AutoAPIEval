import javax.management.NotificationListener;
import javax.management.StandardEmitterMBean;
import javax.management.ListenerNotFoundException;

public class StandardEmitterMBean_2 {
    public static void main(String[] args) throws ListenerNotFoundException {
        StandardEmitterMBean mbean = new StandardEmitterMBean();
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                System.out.println("Notification received: " + notification);
            }
        };
        mbean.addNotificationListener(listener, null, null);
        mbean.removeNotificationListener(listener);
    }
}
