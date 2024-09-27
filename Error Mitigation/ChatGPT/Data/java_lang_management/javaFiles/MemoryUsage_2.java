import java.lang.management.MemoryUsage;

public class MemoryUsage_2 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(100, 50, 30, 10);
        long usedMemory = memoryUsage.getUsed();
        System.out.println("Used memory: " + usedMemory + " bytes");
    }
}
