import javax.management.MBeanInfo;

public class MBeanInfo_1 {
    public static void main(String[] args) {
        MBeanInfo mBeanInfo = new MBeanInfo();
        String description = mBeanInfo.getDescription();
        System.out.println("Description: " + description);
    }
}
