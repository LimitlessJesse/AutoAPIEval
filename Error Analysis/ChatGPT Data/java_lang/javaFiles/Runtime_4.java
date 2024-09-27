import java.lang.Runtime;

public class Runtime_4 {
    public static void main(String[] args) {
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Free memory (in bytes): " + freeMemory);
    }
}
