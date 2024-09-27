import java.security.AllPermission;

public class AllPermission_1 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        boolean result = allPermission.implies(new AllPermission());
        System.out.println("Permission implied: " + result);
    }
}
