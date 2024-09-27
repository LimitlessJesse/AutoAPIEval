import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

public class ManagementFactory_5 {
    public static void main(String[] args) {
        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        
        // Access and use methods from ClassLoadingMXBean here
        System.out.println("Total Loaded Class Count: " + classLoadingMXBean.getTotalLoadedClassCount());
    }
}
