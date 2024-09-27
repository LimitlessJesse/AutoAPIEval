import java.util.PropertyPermission;

public class PropertyPermission_2 {
    public static void main(String[] args) {
        PropertyPermission permission1 = new PropertyPermission("java.util.PropertyPermission", "read");
        PropertyPermission permission2 = new PropertyPermission("java.util.PropertyPermission", "read");
        PropertyPermission permission3 = new PropertyPermission("java.lang.RuntimePermission", "read");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
