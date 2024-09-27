import java.lang.ThreadLocal;

public class ThreadLocal_1 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        // Set value
        threadLocal.set("Hello World");

        // Get value
        System.out.println(threadLocal.get());
    }
}
