import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import javax.management.StandardEmitterMBean;

public class StandardEmitterMBean_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        StandardEmitterMBean emitter = new StandardEmitterMBean(broadcaster);

        Notification notification = new Notification("TestNotification", this, 0, "Test message");
        emitter.sendNotification(notification);
    }
}
