import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.StandardMBean;
import javax.management.MBeanServer;
import javax.management.InstanceAlreadyExistsException;
import javax.management.NotCompliantMBeanException;
import javax.management.MalformedObjectNameException;

public class MBeanInfo_12 {
    public static void main(String[] args) throws InstanceAlreadyExistsException,
            NotCompliantMBeanException, MalformedObjectNameException {

        // Create a simple MBean
        Hello mbean = new Hello();
        ObjectName name = new ObjectName("com.example:type=Hello");
        MBeanServer server = MBeanServer.getMBeanServer();
        server.registerMBean(new StandardMBean(mbean, Hello.class), name);

        // Get the MBeanInfo
        MBeanInfo info = server.getMBeanInfo(name);

        // Print the MBeanInfo
        System.out.println(info.toString());
    }
}

class Hello implements HelloMBean {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

interface HelloMBean {
    void sayHello();
}
