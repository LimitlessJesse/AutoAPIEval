import java.lang.ThreadLocal;

public class ThreadLocal_3 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Value to remove");
        
        System.out.println("Before removal: " + threadLocal.get());
        
        threadLocal.remove();
        
        System.out.println("After removal: " + threadLocal.get());
    }
}
