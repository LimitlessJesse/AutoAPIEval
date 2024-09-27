import javax.management.ObjectName;
import javax.management.MBeanServer;
import javax.management.ObjectInstance;

public class ObjectInstance_2 {
    public static void main(String[] args) {
        MBeanServer mbs = null; // Assume this is your MBeanServer
        ObjectInstance oi = null; // Assume this is your ObjectInstance
        ObjectName on = oi.getObjectName();
        System.out.println(on);
    }
}
