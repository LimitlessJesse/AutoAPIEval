import javax.management.ObjectInstance;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class ObjectInstance_3 {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = null; // Assume this is your MBeanServer
        ObjectName name = new ObjectName("com.example:type=Test"); // Assume this is your ObjectName
        ObjectInstance oi = mbs.getObjectInstance(name);
        String className = oi.getClassName();
        System.out.println("Class Name: " + className);
    }
}
