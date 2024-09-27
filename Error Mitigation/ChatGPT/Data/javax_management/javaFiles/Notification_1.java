import javax.management.Notification;

public class Notification_1 {
    public static void main(String[] args) {
        Notification notification = new Notification("Type", "Source", 1);
        notification.setSequenceNumber(123);
        System.out.println("Sequence Number: " + notification.getSequenceNumber());
    }
}
