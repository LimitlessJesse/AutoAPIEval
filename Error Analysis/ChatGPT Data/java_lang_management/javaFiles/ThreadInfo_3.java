import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class ThreadInfo_3 {
    public static void main(String[] args) {
        ThreadInfo info = ManagementFactory.getThreadMXBean().getThreadInfo(Thread.currentThread().getId());
        StackTraceElement[] stackTraceElements = info.getStackTrace();
        
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getClassName() + "." + element.getMethodName() + "(" + element.getFileName() + ":" + element.getLineNumber() + ")");
        }
    }
}
