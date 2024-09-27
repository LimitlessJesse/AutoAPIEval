import javax.management.MBeanConstructorInfo;

public class MBeanConstructorInfo_5 {
    public static void main(String[] args) {
        MBeanConstructorInfo constructor1 = new MBeanConstructorInfo("constructor1", "description");
        MBeanConstructorInfo constructor2 = new MBeanConstructorInfo("constructor1", "description");

        boolean isEqual = constructor1.equals(constructor2);
        System.out.println("Are the two constructors equal? " + isEqual);
    }
}
