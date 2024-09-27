import java.lang.management.MemoryUsage;

public class MemoryUsage_3 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(10, 5, 15, 3);
        long committed = memoryUsage.getCommitted();
        System.out.println("Committed memory: " + committed);
    }
}
