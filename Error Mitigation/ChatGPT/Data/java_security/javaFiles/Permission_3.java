import java.security.Permission;
import java.security.PermissionCollection;

public class Permission_3 {
    public static void main(String[] args) {
        Permission permission = new Permission() {
            @Override
            public boolean implies(Permission permission) {
                return false;
            }

            @Override
            public String getActions() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
            public String toString() {
                return null;
            }

            @Override
            public PermissionCollection newPermissionCollection() {
                return null;
            }
        };

        PermissionCollection permissionCollection = permission.newPermissionCollection();
        System.out.println(permissionCollection);
    }
}
