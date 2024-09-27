import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_6 {
    public static void main(String[] args) {
        MBeanNotificationInfo info1 = new MBeanNotificationInfo(new String[]{"Test"}.getClass().getName(), "Test", "Test");
        MBeanNotificationInfo info2 = new MBeanNotificationInfo(new String[]{"Test"}.getClass().getName(), "Test", "Test");

        boolean isEqual = info1.equals(info2);
        System.out.println("Are the two MBeanNotificationInfo objects equal? " + isEqual);
    }
}
