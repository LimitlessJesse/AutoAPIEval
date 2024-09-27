import java.security.Permission;
import java.security.BasicPermission;

public class BasicPermission_3 {
    public static void main(String[] args) {
        // Create a BasicPermission object
        BasicPermission permission1 = new BasicPermission("a.b.c");

        // Create another BasicPermission object
        BasicPermission permission2 = new BasicPermission("a.b.*");

        // Check if permission2 implies permission1
        boolean implies = permission2.implies(permission1);

        // Print the result
        System.out.println(implies);
    }
}
