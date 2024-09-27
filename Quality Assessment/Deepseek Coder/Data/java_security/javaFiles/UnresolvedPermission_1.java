import java.security.*;

public class UnresolvedPermission_1 {
    public static void main(String[] args) {
        try {
            // Create a new UnresolvedPermission
            UnresolvedPermission permission = new UnresolvedPermission("");

            // Get the actions of the permission
            String actions = permission.getActions();

            // Print the actions
            System.out.println("Actions: " + actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
