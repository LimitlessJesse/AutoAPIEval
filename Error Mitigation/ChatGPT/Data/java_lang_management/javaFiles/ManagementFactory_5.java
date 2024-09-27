import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

public class ManagementFactory_5 {
    public static void main(String[] args) {
        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        System.out.println("Loaded Class Count: " + classLoadingMXBean.getLoadedClassCount());
        System.out.println("Total Loaded Class Count: " + classLoadingMXBean.getTotalLoadedClassCount());
        System.out.println("Unloaded Class Count: " + classLoadingMXBean.getUnloadedClassCount());
    }
}
