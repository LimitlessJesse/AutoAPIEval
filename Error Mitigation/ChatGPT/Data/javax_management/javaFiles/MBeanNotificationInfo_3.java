import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_3 {
    public static void main(String[] args) {
        MBeanNotificationInfo info = new MBeanNotificationInfo(new String[]{"type1", "type2"}, "Notification description", "Notification name");
        String[] notifTypes = info.getNotifTypes();
        for (String type : notifTypes) {
            System.out.println(type);
        }
    }
}
