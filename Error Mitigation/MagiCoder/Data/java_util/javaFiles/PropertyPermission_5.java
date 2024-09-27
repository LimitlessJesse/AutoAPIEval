import java.util.PropertyPermission;

public class PropertyPermission_5 {
    public static void main(String[] args) {
        PropertyPermission permission = new PropertyPermission("java.version", "read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
