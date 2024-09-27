import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class ManagementFactory_5 {
    public static void main(String[] args) {
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();
        for (MemoryPoolMXBean memoryPoolMXBean : memoryPoolMXBeans) {
            System.out.println(memoryPoolMXBean.getName());
        }
    }
}
