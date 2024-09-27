import java.security.Permission;

public class Permission_1 {
    public static void main(String[] args) {
        Permission permission = new FilePermission("/path/to/file", "read,write");
        String actions = permission.getActions();
        System.out.println("Actions: " + actions);
    }
}
