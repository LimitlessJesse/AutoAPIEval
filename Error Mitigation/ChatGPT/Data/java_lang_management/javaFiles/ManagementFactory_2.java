import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ManagementFactory_2 {
    public static void main(String[] args) {
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        System.out.println(threadBean.getThreadCount());
    }
}
