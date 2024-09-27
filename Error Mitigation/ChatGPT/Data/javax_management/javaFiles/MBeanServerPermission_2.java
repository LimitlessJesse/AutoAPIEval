import javax.management.MBeanServerPermission;

public class MBeanServerPermission_2 {
    public static void main(String[] args) {
        MBeanServerPermission permission1 = new MBeanServerPermission("createMBeanServer");
        MBeanServerPermission permission2 = new MBeanServerPermission("newMBeanServer");

        boolean implies = permission1.implies(permission2);
        System.out.println("Permission 1 implies Permission 2: " + implies);
    }
}
