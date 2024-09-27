import java.util.PropertyPermission;

public class PropertyPermission_3 {
    public static void main(String[] args) {
        PropertyPermission permission = new PropertyPermission("java.version", "read,write");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
