import javax.management.MBeanConstructorInfo;

public class MBeanConstructorInfo_4 {
    public static void main(String[] args) {
        MBeanConstructorInfo constructorInfo = new MBeanConstructorInfo("Constructor", "Description", null);
        System.out.println(constructorInfo.toString());
    }
}
