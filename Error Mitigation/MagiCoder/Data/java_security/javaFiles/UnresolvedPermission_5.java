import java.security.Permission;
import java.security.UnresolvedPermission;

public class UnresolvedPermission_5 {
    public static void main(String[] args) {
        Permission permission = new UnresolvedPermission("ClassName", "name", "actions");
        System.out.println(permission.toString());
    }
}
