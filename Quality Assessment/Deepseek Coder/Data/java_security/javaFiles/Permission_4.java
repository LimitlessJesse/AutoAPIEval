import java.security.Permission;
import java.security.Permissions;

public class Permission_4 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        permissions.add(new RuntimePermission("createClassLoader"));
        permissions.add(new RuntimePermission("accessClassInPackage.java.lang"));

        for (Permission permission : permissions) {
            System.out.println(permission.getActions());
        }
    }
}
