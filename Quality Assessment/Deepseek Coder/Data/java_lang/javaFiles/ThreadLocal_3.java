import java.util.HashMap;

public class ThreadLocal_3 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        // Set the value for the current thread
        threadLocal.set("Hello");

        // Get the value for the current thread
        System.out.println(threadLocal.get());

        // Remove the value for the current thread
        threadLocal.remove();

        // Try to get the value for the current thread after removing it
        System.out.println(threadLocal.get());
    }
}
