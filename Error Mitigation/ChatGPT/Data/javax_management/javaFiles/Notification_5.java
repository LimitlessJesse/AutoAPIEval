import javax.management.Notification;

public class Notification_5 {
    public static void main(String[] args) {
        Notification notification = new Notification("com.example.alarm.router", this, 1);
        String type = notification.getType();
        System.out.println("Notification type: " + type);
    }
}
