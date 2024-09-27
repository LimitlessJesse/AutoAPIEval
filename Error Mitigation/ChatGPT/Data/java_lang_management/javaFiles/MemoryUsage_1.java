import java.lang.management.MemoryUsage;

public class MemoryUsage_1 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(100, 50, 200, 20);
        long initialMemory = memoryUsage.getInit();
        System.out.println("Initial memory size: " + initialMemory);
    }
}
