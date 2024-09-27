import javax.management.MBeanPermission;

public class MBeanPermission_5 {
    public static void main(String[] args) {
        MBeanPermission permission = new MBeanPermission("javax.management.modelmbean:type=Test", "read");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
