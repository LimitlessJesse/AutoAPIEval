import java.lang.management.MemoryUsage;

public class MemoryUsage_4 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(1024, 2048, 512, 256);
        long maxMemory = memoryUsage.getMax();
        System.out.println("Maximum memory: " + maxMemory + " bytes");
    }
}
