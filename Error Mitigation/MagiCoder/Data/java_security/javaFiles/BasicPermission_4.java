import java.security.BasicPermission;

public class BasicPermission_4 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("test");
        BasicPermission permission2 = new BasicPermission("test");
        BasicPermission permission3 = new BasicPermission("test2");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
