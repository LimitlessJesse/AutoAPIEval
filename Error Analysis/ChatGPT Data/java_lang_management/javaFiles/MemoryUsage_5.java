import java.lang.management.MemoryUsage;

public class MemoryUsage_5 {
    public static void main(String[] args) {
        MemoryUsage memoryUsage = new MemoryUsage(100, 50, 200, 150);
        System.out.println(memoryUsage.toString());
    }
}
