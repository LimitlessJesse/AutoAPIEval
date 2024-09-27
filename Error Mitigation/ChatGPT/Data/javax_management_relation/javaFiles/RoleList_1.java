import javax.management.relation.RoleList;
import javax.management.relation.Role;

public class RoleList_1 {
    public static void main(String[] args) {
        RoleList roleList = new RoleList();
        Role role = new Role("roleName", new ArrayList<String>());
        
        try {
            roleList.add(role);
            System.out.println("Role added successfully: " + roleList);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Role cannot be null");
        }
    }
}
