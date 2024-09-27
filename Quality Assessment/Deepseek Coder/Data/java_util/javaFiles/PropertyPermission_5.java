import java.security.Permission;
import java.util.PropertyPermission;

public class PropertyPermission_5 {
    public static void main(String[] args) {
        // Create two PropertyPermission objects
        PropertyPermission permission1 = new PropertyPermission("test", "read");
        PropertyPermission permission2 = new PropertyPermission("test", "write");

        // Use the equals method to compare the two objects
        boolean isEqual = permission1.equals(permission2);

        // Print the result
        System.out.println("Are the two permissions equal? " + isEqual);
    }
}
