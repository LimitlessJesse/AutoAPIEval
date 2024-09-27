import java.security.Permission;
import java.security.Permissions;

public class Permission_5 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        permissions.add(new RuntimePermission("createClassLoader"));
        
        for (Permission permission : permissions) {
            System.out.println(permission.getName());
        }
    }
}
