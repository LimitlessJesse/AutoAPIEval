import java.util.PropertyPermission;

public class PropertyPermission_2 {
    public static void main(String[] args) {
        PropertyPermission propertyPermission = new PropertyPermission("java.version", "read");
        String actions = propertyPermission.getActions();
        System.out.println("Actions allowed on property: " + actions);
    }
}
