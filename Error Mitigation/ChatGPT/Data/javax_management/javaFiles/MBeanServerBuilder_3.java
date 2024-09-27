import javax.management.MBeanServerBuilder;
import javax.management.MBeanServerDelegate;

public class MBeanServerBuilder_3 {
    public static void main(String[] args) {
        MBeanServerBuilder builder = MBeanServerBuilder.newMBeanServerBuilder();
        MBeanServerDelegate delegate = builder.newMBeanServerDelegate();
        System.out.println("New MBeanServerDelegate created: " + delegate);
    }
}
