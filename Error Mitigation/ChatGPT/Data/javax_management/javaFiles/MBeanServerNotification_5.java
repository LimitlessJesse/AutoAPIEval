import javax.management.MBeanServerNotification;

public class MBeanServerNotification_5 {
    public static void main(String[] args) {
        MBeanServerNotification notification = new MBeanServerNotification("Type", null, 0);
        System.out.println(notification.toString());
    }
}
