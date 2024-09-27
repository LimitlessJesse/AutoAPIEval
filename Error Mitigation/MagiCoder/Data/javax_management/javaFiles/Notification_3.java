import javax.management.Notification;

public class Notification_3 {
    public static void main(String[] args) {
        Notification notification = new Notification("type", new Object(), 0, System.currentTimeMillis(), "message");
        long sequenceNumber = notification.getSequenceNumber();
        System.out.println("Sequence Number: " + sequenceNumber);
    }
}
