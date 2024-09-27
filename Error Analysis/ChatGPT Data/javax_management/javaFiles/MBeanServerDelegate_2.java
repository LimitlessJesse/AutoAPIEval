import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_2 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate() {
            @Override
            public String getImplementationVersion() {
                return "1.0.0";
            }
        };
        
        System.out.println("Implementation Version: " + delegate.getImplementationVersion());
    }
}
