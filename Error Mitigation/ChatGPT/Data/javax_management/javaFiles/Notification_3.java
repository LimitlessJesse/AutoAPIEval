import javax.management.Notification;

public class Notification_3 {
    public static void main(String[] args) {
        Notification notification = new Notification("Type", "Source", 1);
        long timeStamp = System.currentTimeMillis();
        notification.setTimeStamp(timeStamp);
        System.out.println("Notification timestamp: " + notification.getTimeStamp());
    }
}
