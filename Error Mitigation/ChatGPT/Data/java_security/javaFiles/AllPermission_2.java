import java.security.AllPermission;

public class AllPermission_2 {
    public static void main(String[] args) {
        AllPermission permission = new AllPermission();
        String actions = permission.getActions();
        System.out.println("Actions: " + actions);
    }
}
