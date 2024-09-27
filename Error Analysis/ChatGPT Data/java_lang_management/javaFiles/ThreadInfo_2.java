import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class ThreadInfo_2 {
    public static void main(String[] args) {
        ThreadInfo info = ManagementFactory.getThreadMXBean().getThreadInfo(Thread.currentThread().getId());
        String threadName = info.getThreadName();
        System.out.println("Current thread name: " + threadName);
    }
}
