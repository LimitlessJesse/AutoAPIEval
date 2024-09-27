import java.security.Permission;
import java.security.AllPermission;

public class Permission_2 {
    public static void main(String[] args) {
        Permission permission1 = new AllPermission();
        Permission permission2 = new AllPermission();

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
