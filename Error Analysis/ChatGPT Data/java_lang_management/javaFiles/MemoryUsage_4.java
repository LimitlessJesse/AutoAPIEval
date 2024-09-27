import java.lang.management.MemoryUsage;

public class MemoryUsage_4 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(10, 20, 5, 15);
        long max = memoryUsage.getMax();
        System.out.println("Max memory usage: " + max);
    }
}
