import java.lang.management.MemoryNotificationInfo;

public class MemoryNotificationInfo_3 {
    public static void main(String[] args) {
        MemoryNotificationInfo notificationInfo = new MemoryNotificationInfo("notificationType", 
            null, 10L, 20L, "poolName", new javax.management.ObjectName("objectName"));
        
        long count = notificationInfo.getCount();
        System.out.println("Count: " + count);
    }
}
