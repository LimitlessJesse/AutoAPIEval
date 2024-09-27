import javax.management.ObjectName;
import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class Role_4 {
    public static void main(String[] args) {
        Role role = new Role("roleName", new ArrayList<>());
        List<ObjectName> objectNames = new ArrayList<>();
        objectNames.add(new ObjectName("com.example:type=Example"));
        
        try {
            role.setRoleValue(objectNames);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
