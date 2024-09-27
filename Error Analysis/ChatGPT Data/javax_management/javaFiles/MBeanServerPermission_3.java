import javax.management.MBeanServerPermission;

public class MBeanServerPermission_3 {
    public static void main(String[] args) {
        MBeanServerPermission permission1 = new MBeanServerPermission("permissionName1");
        MBeanServerPermission permission2 = new MBeanServerPermission("permissionName2");

        boolean isEqual = permission1.equals(permission2);
        System.out.println("Are the permissions equal? " + isEqual);
    }
}
