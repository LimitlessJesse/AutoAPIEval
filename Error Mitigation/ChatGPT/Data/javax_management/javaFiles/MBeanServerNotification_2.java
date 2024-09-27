import javax.management.ObjectName;
import javax.management.MBeanServerNotification;

public class MBeanServerNotification_2 {
    public static void main(String[] args) {
        MBeanServerNotification notification = new MBeanServerNotification("NotificationType", new ObjectName("domain", "key", "value"));
        ObjectName mbeanName = notification.getMBeanName();
        System.out.println("MBean Name: " + mbeanName);
    }
}
