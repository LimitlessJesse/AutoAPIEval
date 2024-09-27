import java.lang.Runtime;

public class Runtime_9 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Define a shutdown hook
        Thread shutdownHook = new Thread() {
            public void run() {
                System.out.println("Shutdown hook is running!")
            }
        };

        // Register the shutdown hook
        runtime.addShutdownHook(shutdownHook);

        // This will print "Shutdown hook is running!" when the JVM is shutting down
    }
}
