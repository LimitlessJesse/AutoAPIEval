import javax.management.MBeanPermission;

public class MBeanPermission_1 {
    public static void main(String[] args) {
        MBeanPermission permission1 = new MBeanPermission("javax.management", "*");
        MBeanPermission permission2 = new MBeanPermission("javax.management", "*");

        boolean isEqual = permission1.equals(permission2);
        System.out.println(isEqual);
    }
}
