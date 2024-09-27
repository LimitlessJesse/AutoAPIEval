import javax.management.relation.RoleUnresolvedList;
import javax.management.relation.RoleUnresolved;

public class RoleUnresolvedList_1 {
    public static void main(String[] args) {
        RoleUnresolvedList roleUnresolvedList = new RoleUnresolvedList();
        RoleUnresolved role = new RoleUnresolved("roleName", "roleValue");
        
        try {
            roleUnresolvedList.add(role);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
