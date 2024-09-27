import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_1 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate();
        String version = delegate.getImplementationVersion();
        System.out.println("JMX Implementation Version: " + version);
    }
}
