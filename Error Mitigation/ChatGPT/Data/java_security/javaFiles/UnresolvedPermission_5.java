import java.security.UnresolvedPermission;

public class UnresolvedPermission_5 {
    public static void main(String[] args) {
        UnresolvedPermission unresolvedPermission = new UnresolvedPermission("ClassName", "name", "actions");
        System.out.println(unresolvedPermission.toString());
    }
}
