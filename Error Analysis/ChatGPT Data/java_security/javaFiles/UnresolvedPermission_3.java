import java.security.UnresolvedPermission;

public class UnresolvedPermission_3 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("name", "actions");
        String actions = unresolvedPermission.getActions();
        System.out.println("Actions: " + actions);
    }
}
