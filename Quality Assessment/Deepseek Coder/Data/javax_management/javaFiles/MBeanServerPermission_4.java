import javax.management.MBeanServerPermission;
import java.security.Permission;

public class MBeanServerPermission_4 {
    public static void main(String[] args) {
        MBeanServerPermission mBeanServerPermission = new MBeanServerPermission("register", "read,write");
        Permission permission = new Permission("read");
        boolean implies = mBeanServerPermission.implies(permission);
        System.out.println(implies);
    }
}
