import java.security.UnresolvedPermission;

public class UnresolvedPermission_4 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("examplePermission", "exampleAction", null, null);
        String unresolvedType = unresolvedPermission.getUnresolvedType();
        System.out.println("Unresolved Type: " + unresolvedType);
    }
}
