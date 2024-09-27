import javax.management.MBeanPermission;

public class MBeanPermission_2 {
    public static void main(String[] args) {
        MBeanPermission permission = new MBeanPermission("javax.management.MBeanServer", "*");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
