import java.security.UnresolvedPermission;

public class UnresolvedPermission_2 {
    public static void main(String[] args) {
        UnresolvedPermission permission = new UnresolvedPermission("read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
