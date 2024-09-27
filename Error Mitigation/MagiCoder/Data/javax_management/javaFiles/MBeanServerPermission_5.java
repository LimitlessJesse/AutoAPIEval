import javax.management.MBeanServerPermission;

public class MBeanServerPermission_5 {
    public static void main(String[] args) {
        MBeanServerPermission permission1 = new MBeanServerPermission("MBeanServerPermission", "read");
        MBeanServerPermission permission2 = new MBeanServerPermission("MBeanServerPermission", "read");
        MBeanServerPermission permission3 = new MBeanServerPermission("MBeanServerPermission", "write");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
