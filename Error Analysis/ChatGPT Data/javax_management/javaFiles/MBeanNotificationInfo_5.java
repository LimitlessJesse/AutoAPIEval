import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_5 {
    public static void main(String[] args) {
        MBeanNotificationInfo info = new MBeanNotificationInfo(new String[]{"type1", "type2"}, "My Notification", "Notification description");
        String[] types = info.getNotifTypes();
        for(String type : types) {
            System.out.println(type);
        }
    }
}
