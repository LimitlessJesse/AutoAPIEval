import java.security.Permission;
import java.security.UnresolvedPermission;

public class UnresolvedPermission_1 {
    public static void main(String[] args) {
        UnresolvedPermission permission1 = new UnresolvedPermission("some.permission", "some.actions");
        UnresolvedPermission permission2 = new UnresolvedPermission("some.permission", "some.actions");
        UnresolvedPermission permission3 = new UnresolvedPermission("some.other.permission", "some.actions");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
