import javax.management.MBeanNotificationInfo;

public class MBeanInfo_5 {
    public static void main(String[] args) {
        // Assuming you have an instance of MBeanInfo called mbeanInfo
        MBeanNotificationInfo[] notifications = mbeanInfo.getNotifications();
        
        for (MBeanNotificationInfo info : notifications) {
            System.out.println("Notification: " + info.getName());
            System.out.println("Description: " + info.getDescription());
            System.out.println("Types: " + String.join(",", info.getNotifTypes()));
            System.out.println();
        }
    }
}
