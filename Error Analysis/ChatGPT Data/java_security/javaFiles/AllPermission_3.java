import java.security.AllPermission;

public class AllPermission_3 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        int hashCode = allPermission.hashCode();
        System.out.println("HashCode of AllPermission: " + hashCode);
    }
}
