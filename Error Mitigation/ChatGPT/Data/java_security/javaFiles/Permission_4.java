import java.security.Permission;

public class Permission_4 {
    public static void main(String[] args) {
        Permission permission1 = new Permission("read");
        Permission permission2 = new Permission("read");

        boolean areEqual = permission1.equals(permission2);
        System.out.println("Are permissions equal? " + areEqual);
    }
}
