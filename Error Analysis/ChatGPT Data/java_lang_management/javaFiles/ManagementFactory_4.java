import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ManagementFactory_4 {
    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        
        // Print the name of the running Java Virtual Machine
        System.out.println("Name of the running JVM: " + runtimeMXBean.getName());
        
        // Print the uptime of the Java Virtual Machine in milliseconds
        System.out.println("Uptime of the JVM: " + runtimeMXBean.getUptime() + " ms");
        
        // Print the input arguments passed to the JVM
        System.out.println("Input arguments: " + runtimeMXBean.getInputArguments());
        
        // Print the system properties passed to the JVM
        System.out.println("System properties: " + runtimeMXBean.getSystemProperties());
    }
}
