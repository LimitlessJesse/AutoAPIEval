import java.lang.Runtime;

public class Runtime_1 {
    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Total memory: " + totalMemory);
    }
}
