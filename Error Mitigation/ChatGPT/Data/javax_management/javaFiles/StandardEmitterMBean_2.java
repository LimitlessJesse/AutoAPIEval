import javax.management.NotificationListener;
import javax.management.ListenerNotFoundException;
import javax.management.StandardEmitterMBean;

public class StandardEmitterMBean_2 {
    public static void main(String[] args) {
        StandardEmitterMBean mbean = new StandardEmitterMBean();
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                // Handle notification
            }
        };
        
        try {
            mbean.removeNotificationListener(listener);
        } catch (ListenerNotFoundException e) {
            e.printStackTrace();
        }
    }
}
