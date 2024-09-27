import javax.management.*;

public class StandardEmitterMBean_1 {
    public static void main(String[] args) {
        // Create a new MBean server
        MBeanServer mbs = MBeanServerFactory.createMBeanServer();

        // Create a new StandardEmitterMBean
        StandardEmitterMBean mbean = new StandardEmitterMBean();

        // Create a new NotificationListener
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(Notification notification, Object handback) {
                System.out.println("Notification received: " + notification);
            }
        };

        // Create a new NotificationFilter
        NotificationFilter filter = new NotificationFilter() {
            @Override
            public boolean isNotificationEnabled(Notification notification) {
                return true;
            }
        };

        // Add the listener to the MBean
        mbean.addNotificationListener(listener, filter, null);

        // Send a notification
        mbean.sendNotification(new Notification("test", mbean, 0, "Test notification"));
    }
}
