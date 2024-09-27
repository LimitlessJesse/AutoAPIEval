import java.lang.management.ManagementFactory;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;

public class MonitorInfo_3 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = ManagementFactory.getThreadMXBean().getThreadInfo(Thread.currentThread().getId(), true);
        MonitorInfo[] monitorInfo = threadInfo.getLockedMonitors();
        
        if (monitorInfo.length > 0) {
            StackTraceElement stackFrame = monitorInfo[0].getLockedStackFrame();
            System.out.println("Locked stack frame: " + stackFrame);
        } else {
            System.out.println("No locked monitors found.");
        }
    }
}
