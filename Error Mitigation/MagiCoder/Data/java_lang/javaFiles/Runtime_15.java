import java.lang.Runtime;

public class Runtime_15 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Number of processors available to the JVM: " + rt.availableProcessors());
    }
}
