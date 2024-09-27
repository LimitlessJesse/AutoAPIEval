import javax.management.MBeanPermission;
import java.security.Permission;

public class MBeanPermission_5 {
    public static void main(String[] args) {
        MBeanPermission mbeanPermission = new MBeanPermission("javax.management.MBeanServer", "queryNames", "read");
        Permission permission = new MBeanPermission("javax.management.MBeanServer", "queryNames", "read");

        boolean implies = mbeanPermission.implies(permission);
        System.out.println(implies);
    }
}
