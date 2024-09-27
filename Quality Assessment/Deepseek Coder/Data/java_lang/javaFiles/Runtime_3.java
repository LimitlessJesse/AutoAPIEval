import java.lang.Runtime;

public class Runtime_3 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int processors = runtime.availableProcessors();
        System.out.println("Available processors: " + processors);
    }
}
