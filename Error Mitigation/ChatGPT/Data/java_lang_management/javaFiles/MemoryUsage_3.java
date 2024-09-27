import java.lang.management.MemoryUsage;

public class MemoryUsage_3 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(100, 200, 300, 400);
        long committedMemory = memoryUsage.getCommitted();
        System.out.println("Committed Memory: " + committedMemory + " bytes");
    }
}
