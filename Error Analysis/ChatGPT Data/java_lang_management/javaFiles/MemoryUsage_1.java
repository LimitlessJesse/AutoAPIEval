import java.lang.management.MemoryUsage;

public class MemoryUsage_1 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(100, 50, 30, 10);
        System.out.println("Initial memory usage: " + memoryUsage.getInit());
    }
}
