import java.security.Permission;

public class UnresolvedPermission_1 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("permissionName", "actions", null, null);
        String actions = unresolvedPermission.getActions();
        System.out.println("Actions: " + actions);
    }
}
