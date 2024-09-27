import java.security.AllPermission;
import java.security.Permission;

public class AllPermission_1 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        Permission permission = new Permission() {
            @Override
            public String getName() {
                return "Test Permission";
            }

            @Override
            public boolean implies(Permission permission) {
                return true;
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
                return null;
            }
        };

        boolean isImplied = allPermission.implies(permission);
        System.out.println("Is Implied: " + isImplied);
    }
}
