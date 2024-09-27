import java.lang.management.*;

public class MonitorInfo_1 {
    public static void main(String[] args) {
        Object lock = new Object();
        MonitorInfo monitor = new MonitorInfo(lock);
        int lockedStackDepth = monitor.getLockedStackDepth();
        System.out.println("Locked stack depth: " + lockedStackDepth);
    }
}
