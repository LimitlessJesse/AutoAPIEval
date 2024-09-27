import java.security.AllPermission;

public class AllPermission_4 {
    public static void main(String[] args) {
        AllPermission allPermission = new AllPermission();
        int hashCode = allPermission.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
