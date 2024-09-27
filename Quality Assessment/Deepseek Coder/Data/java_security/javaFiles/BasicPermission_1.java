import java.security.BasicPermission;
import java.security.Permission;

public class BasicPermission_1 {
    public static void main(String[] args) {
        // Create a new BasicPermission
        BasicPermission permission1 = new BasicPermission("write");

        // Create another Permission
        Permission permission2 = new Permission("write") {
            public boolean implies(Permission p) {
                return p.getName().equals("write");
            }
        };

        // Check if permission1 implies permission2
        boolean implies = permission1.implies(permission2);

        // Print the result
        System.out.println(implies);
    }
}
