import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_5 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long stealCount = pool.getStealCount();
        System.out.println("Steal Count: " + stealCount);
    }
}
