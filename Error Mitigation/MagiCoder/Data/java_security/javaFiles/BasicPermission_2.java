import java.security.BasicPermission;

public class BasicPermission_2 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("test");
        System.out.println(permission.getActions());
    }
}
