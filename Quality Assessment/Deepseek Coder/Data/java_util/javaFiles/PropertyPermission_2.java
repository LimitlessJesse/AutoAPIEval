import java.util.PropertyPermission;

public class PropertyPermission_2 {
    public static void main(String[] args) {
        // Create a new PropertyPermission
        PropertyPermission permission = new PropertyPermission("test.property", "read");

        // Get the actions from the permission
        String actions = permission.getActions();

        // Print the actions
        System.out.println(actions);
    }
}
