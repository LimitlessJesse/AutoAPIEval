import javax.management.NotificationFilterSupport;

public class NotificationFilterSupport_1 {
    public static void main(String[] args) {
        NotificationFilterSupport filter = new NotificationFilterSupport();
        filter.enableType("Type1");
        System.out.println("Enabled type: Type1");
    }
}
