import java.lang.management.LockInfo;
import java.lang.management.ThreadInfo;
import java.lang.management.ManagementFactory;

public class LockInfo_4 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = ManagementFactory.getThreadMXBean().getThreadInfo(Thread.currentThread().getId());
        for (LockInfo lockInfo : threadInfo.getLockedSynchronizers()) {
            System.out.println("Class Name: " + lockInfo.getClassName());
        }
    }
}
