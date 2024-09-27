import javax.management.MBeanNotificationInfo;
import javax.management.Notification;

public class MBeanNotificationInfo_5 {
    public static void main(String[] args) {
        MBeanNotificationInfo info1 = new MBeanNotificationInfo(
                new String[]{Notification.SEVERITY_WARNING},
                "Test",
                "Test description");

        MBeanNotificationInfo info2 = new MBeanNotificationInfo(
                new String[]{Notification.SEVERITY_WARNING},
                "Test",
                "Test description");

        MBeanNotificationInfo info3 = new MBeanNotificationInfo(
                new String[]{Notification.SEVERITY_CRITICAL},
                "Test",
                "Test description");

        System.out.println(info1.equals(info2)); // true
        System.out.println(info1.equals(info3)); // false
    }
}
