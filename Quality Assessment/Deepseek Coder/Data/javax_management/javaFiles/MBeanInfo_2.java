import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.MBeanServer;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanServerFactory;
import java.lang.management.ManagementFactory;

public class MBeanInfo_2 {
    public static void main(String[] args) {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = null;
        try {
            name = new ObjectName("com.example:type=Test");
            mbs.registerMBean(new Test(), name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MBeanInfo info = null;
        try {
            info = mbs.getMBeanInfo(name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(info.getClassName());
    }
}

class Test {
    private String testAttribute;

    public String getTestAttribute() {
        return testAttribute;
    }

    public void setTestAttribute(String testAttribute) {
        this.testAttribute = testAttribute;
    }
}
