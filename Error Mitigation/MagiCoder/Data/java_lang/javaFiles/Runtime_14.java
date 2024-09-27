import java.lang.Runtime;

public class Runtime_14 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        System.out.println("Max Memory: " + maxMemory);
    }
}
