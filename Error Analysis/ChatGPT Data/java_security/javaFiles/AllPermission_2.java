import java.security.AllPermission;

public class AllPermission_2 {
    public static void main(String[] args) {
        AllPermission perm = new AllPermission();
        AllPermission perm2 = new AllPermission();
        
        // Using equals() method to compare two AllPermission objects
        boolean result = perm.equals(perm2);
        System.out.println("Are the two AllPermission objects equal? " + result);
    }
}
