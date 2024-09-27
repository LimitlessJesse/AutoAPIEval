import java.security.AllPermission;
import java.security.Permission;

public class AllPermission_1 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        Permission permission = new Permission("some.permission") {
            @Override
            public boolean implies(Permission p) {
                return allPermission.implies(p);
            }
        };

        System.out.println(permission.implies(new AllPermission()));
    }
}
