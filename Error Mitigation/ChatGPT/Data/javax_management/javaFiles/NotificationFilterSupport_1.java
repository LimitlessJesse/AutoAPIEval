import javax.management.NotificationFilterSupport;

public class NotificationFilterSupport_1 {
    public static void main(String[] args) {
        NotificationFilterSupport myFilter = new NotificationFilterSupport();
        
        // Enables all notifications the type of which starts with "my_example" to be sent.
        myFilter.enableType("my_example");
        // Enables all notifications the type of which is "my_example.my_type" to be sent.
        myFilter.enableType("my_example.my_type");
    }
}
