import javax.management.relation.Role;
import javax.management.relation.RoleUnresolved;

public class Role_3 {
    public static void main(String[] args) {
        Role role = new RoleUnresolved("MyRole");
        String roleName = role.getRoleName();
        System.out.println("Role Name: " + roleName);
    }
}
