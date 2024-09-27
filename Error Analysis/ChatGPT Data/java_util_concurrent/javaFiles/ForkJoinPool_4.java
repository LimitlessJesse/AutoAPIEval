import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_4 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int parallelism = forkJoinPool.getParallelism();
        System.out.println("Parallelism: " + parallelism);
    }
}
