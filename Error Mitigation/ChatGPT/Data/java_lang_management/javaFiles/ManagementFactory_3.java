import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class ManagementFactory_3 {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Operating System Name: " + osBean.getName());
        System.out.println("Operating System Version: " + osBean.getVersion());
        System.out.println("Operating System Arch: " + osBean.getArch());
    }
}
