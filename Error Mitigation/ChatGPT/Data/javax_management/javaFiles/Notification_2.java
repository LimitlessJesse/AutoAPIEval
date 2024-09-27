import javax.management.Notification;

public class Notification_2 {
    public static void main(String[] args) {
        Notification notification = new Notification("Type", "Source", 1);
        System.out.println("Before setting source: " + notification.getSource());
        
        notification.setSource("New Source");
        System.out.println("After setting source: " + notification.getSource());
    }
}
