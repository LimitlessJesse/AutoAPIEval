import javax.management.remote.JMXConnectionNotification;

public class JMXConnectionNotification_2 {
    public static void main(String[] args) {
        JMXConnectionNotification notification = new JMXConnectionNotification("OPEN", "Connection ID", "Connection ID");
        String connectionId = notification.getConnectionId();
        System.out.println("Connection ID: " + connectionId);
    }
}
