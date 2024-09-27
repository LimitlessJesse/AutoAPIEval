import javax.management.Notification;
import javax.management.remote.TargetedNotification;

public class TargetedNotification_2 {
    public static void main(String[] args) {
        TargetedNotification targetedNotification = new TargetedNotification(new Notification("type", "source", 1), "listenerID");
        Notification notification = targetedNotification.getNotification();
        System.out.println(notification);
    }
}
