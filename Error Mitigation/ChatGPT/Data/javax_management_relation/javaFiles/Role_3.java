import javax.management.relation.Role;

public class Role_3 {
    public static void main(String[] args) {
        Role role = new Role();
        try {
            role.setRoleName("Admin");
            System.out.println("Role name set successfully: " + role.getRoleName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
