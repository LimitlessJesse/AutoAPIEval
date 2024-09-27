import java.util.concurrent.ForkJoinPool;

public class ForkJoinPool_2 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int parallelism = pool.getParallelism();
        System.out.println("Parallelism level: " + parallelism);
    }
}
