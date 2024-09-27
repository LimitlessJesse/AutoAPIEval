import javax.management.MBeanInfo;

public class MBeanInfo_2 {
    public static void main(String[] args) {
        MBeanInfo mBeanInfo = new MBeanInfo();
        String className = mBeanInfo.getClassName();
        System.out.println("Class Name: " + className);
    }
}
