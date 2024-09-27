import java.security.BasicPermission;
import java.security.Permission;

public class BasicPermission_2 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("read");
        BasicPermission permission2 = new BasicPermission("read");

        Permission permission = permission1;

        boolean isEqual = permission.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
