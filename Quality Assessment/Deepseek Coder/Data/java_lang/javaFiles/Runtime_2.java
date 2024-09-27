import java.lang.Runtime;

public class Runtime_2 {
    public static void main(String[] args) {
        // Get the runtime object associated with the current Java application
        Runtime runtime = Runtime.getRuntime();

        // Get the amount of free memory in bytes
        long freeMemory = runtime.freeMemory();

        // Print the amount of free memory
        System.out.println("Free memory: " + freeMemory + " bytes");
    }
}
