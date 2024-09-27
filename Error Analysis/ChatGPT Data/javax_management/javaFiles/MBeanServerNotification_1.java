import javax.management.MBeanServerNotification;

public class MBeanServerNotification_1 {
    public static void main(String[] args) {
        MBeanServerNotification notification = new MBeanServerNotification("NotificationType", null, 0, "MBeanObject");
        System.out.println(notification.getMBeanName());
    }
}
