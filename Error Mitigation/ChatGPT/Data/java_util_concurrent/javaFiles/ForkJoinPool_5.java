import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_5 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        boolean isQuiescent = forkJoinPool.isQuiescent();
        System.out.println("All worker threads are currently idle: " + isQuiescent);
    }
}
