import java.lang.ThreadLocal;

public class ThreadLocal_2 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello ThreadLocal");
        
        String value = threadLocal.get();
        System.out.println(value);
    }
}
