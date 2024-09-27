import java.security.UnresolvedPermission;

public class UnresolvedPermission_4 {
    public static void main(String[] args) {
        UnresolvedPermission permission1 = new UnresolvedPermission("read");
        UnresolvedPermission permission2 = new UnresolvedPermission("write");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
