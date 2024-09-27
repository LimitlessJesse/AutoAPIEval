import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_3 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate() {
            @Override
            public String getImplementationVendor() {
                return "JavaSoft";
            }
        };

        String implementationVendor = delegate.getImplementationVendor();
        System.out.println("Implementation vendor: " + implementationVendor);
    }
}
