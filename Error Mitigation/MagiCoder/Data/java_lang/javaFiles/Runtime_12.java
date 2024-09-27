import java.lang.Runtime;

public class Runtime_12 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        System.out.println("Total memory: " + totalMemory);
    }
}
