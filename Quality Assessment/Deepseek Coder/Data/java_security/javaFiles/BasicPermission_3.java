import java.security.BasicPermission;

public class BasicPermission_3 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("MyPermission");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
