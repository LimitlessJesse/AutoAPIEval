import java.security.AllPermission;
import java.security.Permission;
import java.security.Permissions;

public class AllPermission_1 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        Permission permission = new Permission("some.permission");
        System.out.println(allPermission.implies(permission));
    }
}
