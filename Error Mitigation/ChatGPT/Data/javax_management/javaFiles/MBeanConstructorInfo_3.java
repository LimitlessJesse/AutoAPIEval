import javax.management.MBeanConstructorInfo;

public class MBeanConstructorInfo_3 {
    public static void main(String[] args) {
        MBeanConstructorInfo constructorInfo = new MBeanConstructorInfo("ConstructorName", "Description", null);
        System.out.println(constructorInfo.toString());
    }
}
