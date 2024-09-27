import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1000, null);
        long taskCount = executor.getTaskCount();
        System.out.println("Task count in the ThreadPoolExecutor: " + taskCount);
    }
}
