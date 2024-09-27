import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_1 {
    public static void main(String[] args) {
        MBeanNotificationInfo notificationInfo = new MBeanNotificationInfo(new String[]{"type1", "type2"}, "Notification Info", "Description");
        String[] notifTypes = notificationInfo.getNotifTypes();
        
        System.out.println("Notification Types:");
        for(String type : notifTypes) {
            System.out.println(type);
        }
    }
}
