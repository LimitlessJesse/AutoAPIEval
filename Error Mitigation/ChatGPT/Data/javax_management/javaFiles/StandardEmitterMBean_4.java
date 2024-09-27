import javax.management.Notification;
import javax.management.StandardEmitterMBean;

public class StandardEmitterMBean_4 {
    public static void main(String[] args) {
        StandardEmitterMBean mbean = new StandardEmitterMBean(new YourMBeanImplementation(), YourMBeanInterface.class);
        Notification notification = new Notification("type", mbean, 1, "Hello, World");
        mbean.sendNotification(notification);
    }
}
