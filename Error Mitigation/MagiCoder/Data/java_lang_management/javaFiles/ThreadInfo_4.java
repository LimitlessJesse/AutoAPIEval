import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadInfo_4 {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMXBean.getAllThreadIds();
        ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(threadIds);

        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("Thread ID: " + threadInfo.getThreadId());
            System.out.println("Thread Name: " + threadInfo.getThreadName());
            System.out.println("Stack Trace: ");
            StackTraceElement[] stackTraceElements = threadInfo.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.println(stackTraceElement);
            }
            System.out.println("----------------------------");
        }
    }
}
