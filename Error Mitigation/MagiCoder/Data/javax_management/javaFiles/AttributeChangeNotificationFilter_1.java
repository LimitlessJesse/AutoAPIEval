import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationFilter;

public class AttributeChangeNotificationFilter_1 {
    public static void main(String[] args) {
        NotificationFilter filter = new AttributeChangeNotificationFilter();
        Notification notification = new AttributeChangeNotification(
                this,
                1,
                System.currentTimeMillis(),
                "Attribute changed",
                "Attribute",
                "String",
                "oldValue",
                "newValue"
        );
        boolean isEnabled = filter.isNotificationEnabled(notification);
        System.out.println("Notification is enabled: " + isEnabled);
    }
}
