import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadInfo_4 {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMXBean.getAllThreadIds();
        
        for (long threadId : threadIds) {
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
            StackTraceElement[] stackTrace = threadInfo.getStackTrace();
            
            System.out.println("Thread ID: " + threadId);
            for (StackTraceElement element : stackTrace) {
                System.out.println(element.toString());
            }
        }
    }
}
