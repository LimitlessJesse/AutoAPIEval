import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class ManagementFactory_3 {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        System.out.println("Operating System Name: " + osBean.getName());
        System.out.println("Operating System Version: " + osBean.getVersion());
        System.out.println("Available Processors: " + osBean.getAvailableProcessors());
    }
}
