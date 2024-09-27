import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;

public class MBeanServerFactory_1 {
    public static void main(String[] args) {
        MBeanServer mbs = MBeanServerFactory.createMBeanServer("MyServer");
        System.out.println(mbs);
    }
}
