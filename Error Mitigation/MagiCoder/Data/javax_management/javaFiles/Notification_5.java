import javax.management.Notification;

public class Notification_5 {
    public static void main(String[] args) {
        Notification notification = new Notification("type", new Object(), 0, System.currentTimeMillis(), "Message");
        String message = notification.getMessage();
        System.out.println(message);
    }
}
