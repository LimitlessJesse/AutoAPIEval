import java.lang.System;

public class System_3 {
    public static void main(String[] args) {
        // Request JVM to initiate garbage collection
        System.gc();

        // Print the current status of the JVM's memory
        System.out.println("Memory before: " + Runtime.getRuntime().totalMemory());

        // Create a large object that will be garbage collected
        String largeObject = new String(new char[1000000]);

        // Print the current status of the JVM's memory
        System.out.println("Memory after: " + Runtime.getRuntime().totalMemory());

        // Request JVM to initiate garbage collection
        System.gc();

        // Print the current status of the JVM's memory
        System.out.println("Memory after gc: " + Runtime.getRuntime().totalMemory());
    }
}
