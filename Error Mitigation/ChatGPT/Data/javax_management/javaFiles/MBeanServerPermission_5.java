import javax.management.MBeanServerPermission;

public class MBeanServerPermission_5 {
    public static void main(String[] args) {
        MBeanServerPermission permission = new MBeanServerPermission("permissionName");
        int hashCode = permission.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
