import java.security.Permission;

public class Permission_2 {
    public static void main(String[] args) {
        Permission perm1 = new RuntimePermission("createClassLoader");
        Permission perm2 = new RuntimePermission("setSecurityManager");
        
        boolean result = perm1.implies(perm2);
        System.out.println("Permission 1 implies Permission 2: " + result);
    }
}
