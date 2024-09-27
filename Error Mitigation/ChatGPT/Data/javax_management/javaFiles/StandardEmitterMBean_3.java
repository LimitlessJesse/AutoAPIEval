import javax.management.NotificationEmitter;
import javax.management.ListenerNotFoundException;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;
import javax.management.StandardEmitterMBean;

public class StandardEmitterMBean_3 {
    public static void main(String[] args) {
        StandardEmitterMBean mbean = new StandardEmitterMBean();
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(javax.management.Notification notification, Object handback) {
                // Handle notification
            }
        };
        NotificationFilter filter = null; // Set your filter here
        Object handback = null; // Set your handback object here
        
        try {
            mbean.removeNotificationListener(listener, filter, handback);
        } catch (ListenerNotFoundException e) {
            e.printStackTrace();
        }
    }
}
