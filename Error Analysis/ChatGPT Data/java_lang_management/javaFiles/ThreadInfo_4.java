import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadInfo_4 {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long threadId = Thread.currentThread().getId();
        ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
        Thread.State threadState = threadInfo.getThreadState();
        System.out.println("Current thread state: " + threadState);
    }
}
