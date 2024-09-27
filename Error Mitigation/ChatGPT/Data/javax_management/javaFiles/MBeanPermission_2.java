import javax.management.MBeanPermission;

public class MBeanPermission_2 {
    public static void main(String[] args) {
        MBeanPermission permission = new MBeanPermission("name", "actions");
        String actions = permission.getActions();
        System.out.println("Actions: " + actions);
    }
}
