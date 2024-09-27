import java.security.AllPermission;
import java.security.PermissionCollection;

public class AllPermission_5 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new AllPermission().newPermissionCollection();
        // use permissionCollection here
    }
}
