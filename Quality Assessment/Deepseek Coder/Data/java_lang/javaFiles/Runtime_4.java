import java.lang.Runtime;

public class Runtime_4 {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Max Memory: " + maxMemory);
    }
}
