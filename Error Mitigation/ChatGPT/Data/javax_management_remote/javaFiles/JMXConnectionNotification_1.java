import javax.management.remote.JMXConnectionNotification;

public class JMXConnectionNotification_1 {
    public static void main(String[] args) {
        JMXConnectionNotification notification = new JMXConnectionNotification("connectionOpened", this, 1, "Connection opened", "testConnectionId");
        String connectionId = notification.getConnectionId();
        System.out.println("Connection ID: " + connectionId);
    }
}
