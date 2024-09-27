import java.lang.management.MonitorInfo;

public class MonitorInfo_1 {
    public static void main(String[] args) {
        MonitorInfo monitorInfo = new MonitorInfo();
        int lockedStackDepth = monitorInfo.getLockedStackDepth();
        System.out.println("Locked stack depth: " + lockedStackDepth);
    }
}
