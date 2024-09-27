import java.security.Permission;
import java.security.AllPermission;

public class AllPermission_3 {
    public static void main(String[] args) {
        Permission permission = new AllPermission();
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
