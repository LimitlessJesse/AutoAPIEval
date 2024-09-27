import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadInfo_3 {
    public static void main(String[] args) {
        // Get the ThreadMXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        // Get all thread info
        ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(threadMXBean.getAllThreadIds());

        // Print the waited time for each thread
        for (ThreadInfo threadInfo : threadInfos) {
            long waitedTime = threadInfo.getWaitedTime();
            System.out.println("Thread " + threadInfo.getThreadName() + " waited time: " + waitedTime);
        }
    }
}
