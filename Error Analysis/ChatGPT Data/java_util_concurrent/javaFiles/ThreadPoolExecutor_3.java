import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_3 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, null);
        
        // Setting the core pool size to 5
        executor.setCorePoolSize(5);
        
        // Displaying the core pool size
        System.out.println("Core Pool Size: " + executor.getCorePoolSize());
    }
}
