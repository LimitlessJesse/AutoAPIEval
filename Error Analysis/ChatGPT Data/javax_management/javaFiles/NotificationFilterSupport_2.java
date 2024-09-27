import javax.management.NotificationFilterSupport;

public class NotificationFilterSupport_2 {
    public static void main(String[] args) {
        NotificationFilterSupport filter = new NotificationFilterSupport();
        
        // Disable a specific type of notification
        String typeToDisable = "TYPE_TO_DISABLE";
        filter.disableType(typeToDisable);
    }
}
