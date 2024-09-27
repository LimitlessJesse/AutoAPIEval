import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class ManagementFactory_1 {
    public static void main(String[] args) {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        System.out.println(memoryBean);
    }
}
