import java.lang.management.MemoryNotificationInfo;

public class MemoryNotificationInfo_1 {
    public static void main(String[] args) {
        MemoryNotificationInfo info = new MemoryNotificationInfo("poolName", null, 0);
        String poolName = info.getPoolName();
        System.out.println("Memory pool name: " + poolName);
    }
}
