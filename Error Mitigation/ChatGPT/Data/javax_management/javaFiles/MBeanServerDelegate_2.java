import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_2 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate();
        String serverId = delegate.getMBeanServerId();
        System.out.println("MBean Server ID: " + serverId);
    }
}
