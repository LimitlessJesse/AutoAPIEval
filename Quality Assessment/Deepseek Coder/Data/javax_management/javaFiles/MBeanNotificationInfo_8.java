import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_8 {
    public static void main(String[] args) {
        MBeanNotificationInfo notificationInfo = new MBeanNotificationInfo(
            new Integer[]{1, 2, 3},
            "Notification Type",
            "Notification Description"
        );

        System.out.println(notificationInfo.toString());
    }
}
