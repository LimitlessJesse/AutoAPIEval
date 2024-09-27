import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.MBeanServer;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanServerFactory;
import javax.management.NotCompliantMBeanException;
import javax.management.MalformedObjectNameException;

public class MBeanInfo_3 {
    public static void main(String[] args) {
        try {
            MBeanServer mbs = MBeanServerFactory.createMBeanServer();
            ObjectName name = new ObjectName("com.example:type=Test");
            Test test = new Test();
            mbs.registerMBean(test, name);

            MBeanInfo info = mbs.getMBeanInfo(name);
            System.out.println(info.getDescription());
        } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException e) {
            e.printStackTrace();
        }
    }
}

class Test {
    // Your MBean implementation here
}
