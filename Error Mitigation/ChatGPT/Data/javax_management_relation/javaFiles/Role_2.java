import javax.management.ObjectName;
import javax.management.relation.Role;

public class Role_2 {
    public static void main(String[] args) {
        Role role = new Role("roleName");
        role.setRoleValue(new ArrayList<ObjectName>());
        role.getRoleValue();
    }
}
