import java.security.BasicPermission;

public class BasicPermission_3 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("permission1");
        BasicPermission permission2 = new BasicPermission("permission2");

        System.out.println("Permission 1 equals Permission 2: " + permission1.equals(permission2));
    }
}
