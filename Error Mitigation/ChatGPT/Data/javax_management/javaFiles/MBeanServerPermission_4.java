import javax.management.MBeanServerPermission;

public class MBeanServerPermission_4 {
    public static void main(String[] args) {
        MBeanServerPermission permission1 = new MBeanServerPermission("permissionName", "actions");
        MBeanServerPermission permission2 = new MBeanServerPermission("permissionName", "actions");

        boolean isEqual = permission1.equals(permission2);
        System.out.println("Are the permissions equal? " + isEqual);
    }
}
