import java.security.Permission;

public class Permission_5 {
    public static void main(String[] args) {
        Permission permission1 = new java.security.BasicPermission("test");
        Permission permission2 = new java.security.BasicPermission("test");

        boolean isEqual = permission1.equals(permission2);
        System.out.println("Are the permissions equal? " + isEqual);
    }
}
