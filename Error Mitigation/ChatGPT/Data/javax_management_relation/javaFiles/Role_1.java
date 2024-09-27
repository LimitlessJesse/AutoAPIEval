import javax.management.relation.Role;

public class Role_1 {
    public static void main(String[] args) {
        Role role = new Role("roleName");
        String roleName = role.getRoleName();
        System.out.println("Role Name: " + roleName);
    }
}
