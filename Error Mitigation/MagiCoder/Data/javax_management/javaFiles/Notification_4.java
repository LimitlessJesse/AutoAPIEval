import javax.management.Notification;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import java.util.Date;

public class Notification_4 {
    public static void main(String[] args) throws Exception {
        MBeanServerConnection mbsc = null; // Assume this is your MBeanServerConnection
        ObjectName on = new ObjectName("com.example:type=MyBean");
        Notification n = mbsc.getNotification(on);
        long timestamp = n.getTimeStamp();
        Date date = new Date(timestamp);
        System.out.println("Notification timestamp: " + date);
    }
}
