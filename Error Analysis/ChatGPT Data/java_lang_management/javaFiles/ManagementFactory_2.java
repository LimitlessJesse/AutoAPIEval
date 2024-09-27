import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ManagementFactory_2 {
    public static void main(String[] args) {
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        
        System.out.println("Thread Count: " + threadBean.getThreadCount());
        System.out.println("Peak Thread Count: " + threadBean.getPeakThreadCount());
        System.out.println("Current Thread CPU Time: " + threadBean.getCurrentThreadCpuTime());
        System.out.println("Daemon Thread Count: " + threadBean.getDaemonThreadCount());
    }
}
