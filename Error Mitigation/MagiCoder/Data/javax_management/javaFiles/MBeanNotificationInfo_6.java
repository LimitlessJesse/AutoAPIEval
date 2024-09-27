import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_6 {
    public static void main(String[] args) {
        MBeanNotificationInfo info = new MBeanNotificationInfo(new String[]{"type"}, "description", "mbean");
        int hashCode = info.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
