import javax.management.*;
import java.util.HashMap;
import java.util.Map;

public class MBeanInfo_8 {
    public static void main(String[] args) {
        try {
            // Create a new MBeanServer
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

            // Create an object name
            ObjectName name = new ObjectName("com.example:type=Test");

            // Create a Map to hold attributes
            Map<String, String> attributes = new HashMap<>();
            attributes.put("Attribute1", "Value1");

            // Create a new MBean
            mbs.createMBean(name, new Test(), attributes);

            // Get the MBeanInfo
            MBeanInfo info = mbs.getMBeanInfo(name);

            // Get the notifications
            MBeanNotificationInfo[] notifications = info.getNotifications();

            // Print the notifications
            for (MBeanNotificationInfo notification : notifications) {
                System.out.println("Notification Type: " + notification.getNotificationType());
                System.out.println("Notification Class: " + notification.getClassName());
                System.out.println("Notification Description: " + notification.getDescription());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Test implements NotificationBroadcaster {
    // Implement the methods of the MBean interface
}
