import javax.management.MBeanPermission;

public class MBeanPermission_1 {
    public static void main(String[] args) {
        MBeanPermission permission1 = new MBeanPermission("javax.management", "*");
        MBeanPermission permission2 = new MBeanPermission("javax.management", "*");
        MBeanPermission permission3 = new MBeanPermission("javax.management", "read");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
