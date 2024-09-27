import javax.management.MBeanPermission;

public class MBeanPermission_4 {
    public static void main(String[] args) {
        MBeanPermission permission = new MBeanPermission("javax.management.MBeanServer", "*");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
