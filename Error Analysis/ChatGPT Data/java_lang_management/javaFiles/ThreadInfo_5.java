import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.MonitorInfo;

public class ThreadInfo_5 {
    public static void main(String[] args) {
        ThreadInfo[] threadInfoArray = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
        
        for (ThreadInfo threadInfo : threadInfoArray) {
            MonitorInfo[] lockedMonitors = threadInfo.getLockedMonitors();
            if (lockedMonitors != null) {
                for (MonitorInfo monitorInfo : lockedMonitors) {
                    System.out.println("Thread " + threadInfo.getThreadName() + " is holding monitor on " + monitorInfo.getClassName());
                }
            }
        }
    }
}
