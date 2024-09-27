import javax.management.Notification;

public class Notification_4 {
    public static void main(String[] args) {
        Notification notification = new Notification("type", "source", 1);
        notification.setUserData("User data example");
        Object userData = notification.getUserData();
        System.out.println("User data: " + userData);
    }
}
