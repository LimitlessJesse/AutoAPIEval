import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_5 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate() {
            @Override
            public String getImplementationName() {
                return "JMX Implementation Name";
            }
        };
        
        System.out.println(delegate.getImplementationName());
    }
}
