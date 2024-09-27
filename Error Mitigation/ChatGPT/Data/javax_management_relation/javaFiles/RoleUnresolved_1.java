import javax.management.relation.RoleUnresolved;

public class RoleUnresolved_1 {
    public static void main(String[] args) {
        RoleUnresolved unresolvedRole = new RoleUnresolved();
        String roleName = unresolvedRole.getRoleName();
        System.out.println("Role Name: " + roleName);
    }
}
