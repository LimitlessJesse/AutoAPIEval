import javax.management.*;
import java.lang.management.*;

public class MBeanInfo_6 {
    public static void main(String[] args) {
        try {
            // Get the platform MBeanServer
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

            // Get the MBeanInfo for the standard HotSwap agent
            ObjectName name = new ObjectName("java.lang:type=HotSwap");
            MBeanInfo info = mbs.getMBeanInfo(name);

            // Get the constructors
            MBeanConstructorInfo[] constructors = info.getConstructors();

            // Print the constructors
            for (MBeanConstructorInfo constructor : constructors) {
                System.out.println(constructor.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
