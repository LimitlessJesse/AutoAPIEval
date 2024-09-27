import javax.management.*;
import java.lang.management.*;

public class MBeanInfo_5 {
    public static void main(String[] args) {
        try {
            // Get the platform MBean server
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

            // Get the MBean info for the Memory MXBean
            ObjectName name = new ObjectName("java.lang:type=Memory");
            MBeanInfo info = mbs.getMBeanInfo(name);

            // Get the attributes of the MBean
            MBeanAttributeInfo[] attributes = info.getAttributes();

            // Print the attributes
            for (MBeanAttributeInfo attribute : attributes) {
                System.out.println(attribute.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
