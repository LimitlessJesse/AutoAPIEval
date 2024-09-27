import java.security.UnresolvedPermission;

public class UnresolvedPermission_3 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("permissionName", "actions", null, null);
        String unresolvedActions = unresolvedPermission.getUnresolvedActions();
        System.out.println("Unresolved Actions: " + unresolvedActions);
    }
}
