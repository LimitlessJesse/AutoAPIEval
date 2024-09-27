import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadInfo_2 {
    public static void main(String[] args) {
        // Get the ThreadMXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        // Get all thread info
        ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(threadMXBean.getAllThreadIds());

        // Print the blocked time for each thread
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("Thread ID: " + threadInfo.getThreadId() + ", Blocked Time: " + threadInfo.getBlockedTime());
        }
    }
}
