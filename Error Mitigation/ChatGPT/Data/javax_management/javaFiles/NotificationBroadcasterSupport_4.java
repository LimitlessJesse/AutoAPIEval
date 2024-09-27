import javax.management.MBeanNotificationInfo;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_4 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        MBeanNotificationInfo[] notifications = broadcaster.getNotificationInfo();
        for (MBeanNotificationInfo notification : notifications) {
            System.out.println("Notification class name: " + notification.getNotifTypes()[0]);
            System.out.println("Notification type: " + notification.getName());
        }
    }
}
