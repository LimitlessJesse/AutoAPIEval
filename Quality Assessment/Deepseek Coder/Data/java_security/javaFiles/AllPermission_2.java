import java.security.AllPermission;

public class AllPermission_2 {
    public static void main(String[] args) {
        AllPermission permission1 = new AllPermission();
        AllPermission permission2 = new AllPermission();

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
