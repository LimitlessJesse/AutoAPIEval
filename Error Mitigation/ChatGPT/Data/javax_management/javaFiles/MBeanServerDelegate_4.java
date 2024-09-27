import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_4 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate();
        String version = delegate.getSpecificationVersion();
        System.out.println("JMX Specification Version: " + version);
    }
}
