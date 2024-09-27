import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

public class MemoryUsage_2 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long usedMemory = memoryUsage.getUsed();
        System.out.println("Used memory: " + usedMemory + " bytes");
    }
}
