import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_4 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int activeThreadCount = forkJoinPool.getActiveThreadCount();
        System.out.println("Active Thread Count: " + activeThreadCount);
    }
}
