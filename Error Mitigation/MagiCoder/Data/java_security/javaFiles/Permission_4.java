import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permission_4 {
    public static void main(String[] args) {
        Permission permission = new Permission("test.permission", "read,write") {
            @Override
            public boolean implies(Permission p) {
                return false;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getActions() {
                return "read,write";
            }
        };

        PermissionCollection permissions = new Permissions();
        permissions.add(permission);

        String actions = permissions.getReadableActions();
        System.out.println(actions);
    }
}
