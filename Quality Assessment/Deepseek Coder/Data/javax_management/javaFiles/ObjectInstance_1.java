import javax.management.ObjectName;
import javax.management.ObjectInstance;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.InstanceNotFoundException;
import javax.management.NotCompliantMBeanException;
import javax.management.JMException;

public class ObjectInstance_1 {
    public static void main(String[] args) {
        try {
            MBeanServer mbs = javax.management.ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("com.example:type=Test");
            ObjectInstance oi = mbs.getObjectInstance(name);
            ObjectName objectName = oi.getObjectName();
            System.out.println("ObjectName: " + objectName);
        } catch (JMException | MalformedObjectNameException | InstanceNotFoundException e) {
            e.printStackTrace();
        }
    }
}
