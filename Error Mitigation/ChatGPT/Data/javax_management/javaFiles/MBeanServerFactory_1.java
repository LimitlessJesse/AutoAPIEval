import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;

public class MBeanServerFactory_1 {
    public static void main(String[] args) {
        MBeanServer mBeanServer = MBeanServerFactory.createMBeanServer("defaultDomain");
        System.out.println("MBeanServer created with default domain: " + mBeanServer.getDefaultDomain());
    }
}
