import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_1 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate();
        String implementationName = delegate.getImplementationName();
        System.out.println("Implementation Name: " + implementationName);
    }
}
