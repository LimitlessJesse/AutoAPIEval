import java.security.AllPermission;

public class AllPermission_3 {
    public static void main(String[] args) {
        AllPermission permission1 = new AllPermission();
        AllPermission permission2 = new AllPermission();
        
        boolean result = permission1.equals(permission2);
        System.out.println("Are the two AllPermission objects equal? " + result);
    }
}
