import java.lang.Runtime;

public class Runtime_13 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        System.out.println("Free memory: " + freeMemory);
    }
}
