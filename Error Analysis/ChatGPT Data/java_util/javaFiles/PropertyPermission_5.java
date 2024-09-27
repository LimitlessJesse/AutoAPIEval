import java.util.PropertyPermission;

public class PropertyPermission_5 {
    public static void main(String[] args) {
        // Creating a new PropertyPermission
        PropertyPermission permission = new PropertyPermission("myproperty", "read");

        // Checking if the permission implies the specified permission
        boolean impliesPermission = permission.implies(new PropertyPermission("myproperty", "read"));

        // Output the result
        System.out.println("Permission implies: " + impliesPermission); 
    }
}
