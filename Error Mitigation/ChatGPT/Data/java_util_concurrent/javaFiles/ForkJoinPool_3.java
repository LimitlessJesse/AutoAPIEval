import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_3 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long stealCount = forkJoinPool.getStealCount();
        System.out.println("Steal Count: " + stealCount);
    }
}
