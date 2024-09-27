import javax.management.MBeanNotificationInfo;
import javax.management.NotificationBroadcasterSupport;

public class NotificationBroadcasterSupport_4 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
        MBeanNotificationInfo[] notificationInfo = broadcaster.getNotificationInfo();
        
        for(MBeanNotificationInfo info : notificationInfo) {
            System.out.println("Name: " + info.getName());
            System.out.println("Description: " + info.getDescription());
            System.out.println("Types: " + String.join(", ", info.getNotifTypes()));
            System.out.println("-----------------------------");
        }
    }
}
