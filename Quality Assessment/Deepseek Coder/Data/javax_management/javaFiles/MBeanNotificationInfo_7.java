import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_7 {
    public static void main(String[] args) {
        MBeanNotificationInfo notificationInfo = new MBeanNotificationInfo(new String[]{"Test"}.getClass(), "Test", "Test");
        int hashCode = notificationInfo.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
