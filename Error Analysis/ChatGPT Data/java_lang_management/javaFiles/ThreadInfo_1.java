import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class ThreadInfo_1 {
    public static void main(String[] args) {
        long threadId = Thread.currentThread().getId();
        ThreadInfo threadInfo = ManagementFactory.getThreadMXBean().getThreadInfo(threadId);
        
        System.out.println("Thread ID: " + threadInfo.getThreadId());
    }
}
