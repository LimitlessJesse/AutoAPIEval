import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ManagementFactory_4 {
    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println("Name: " + runtimeMXBean.getName());
        System.out.println("Class Path: " + runtimeMXBean.getClassPath());
        System.out.println("Library Path: " + runtimeMXBean.getLibraryPath());
        System.out.println("VM Version: " + runtimeMXBean.getVmVersion());
    }
}
