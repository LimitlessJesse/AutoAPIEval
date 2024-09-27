import java.security.UnresolvedPermission;

public class UnresolvedPermission_2 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("targetName", "actions");
        String unresolvedName = unresolvedPermission.getUnresolvedName();
        System.out.println("Unresolved Name: " + unresolvedName);
    }
}
