import java.lang.management.MemoryNotificationInfo;
import java.lang.management.MemoryUsage;

public class MemoryNotificationInfo_2 {
    public static void main(String[] args) {
        MemoryNotificationInfo notificationInfo = new MemoryNotificationInfo("poolName", new MemoryUsage(100, 200, 300, 400), 123456789);
        MemoryUsage memoryUsage = notificationInfo.getUsage();
        System.out.println("Init: " + memoryUsage.getInit());
        System.out.println("Used: " + memoryUsage.getUsed());
        System.out.println("Committed: " + memoryUsage.getCommitted());
        System.out.println("Max: " + memoryUsage.getMax());
    }
}
