import java.security.Permission;

public class Permission_1 {
    public static void main(String[] args) {
        Permission permission = new java.security.BasicPermission("test");
        String actions = permission.getActions();
        System.out.println("Actions: " + actions);
    }
}
