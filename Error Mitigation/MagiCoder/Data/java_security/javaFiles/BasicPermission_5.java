import java.security.BasicPermission;

public class BasicPermission_5 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("test");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
