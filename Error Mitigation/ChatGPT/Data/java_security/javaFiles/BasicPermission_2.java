import java.security.BasicPermission;

public class BasicPermission_2 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("test", null);
        BasicPermission permission2 = new BasicPermission("test", null);
        
        boolean result = permission1.implies(permission2);
        System.out.println("Result: " + result);
    }
}
