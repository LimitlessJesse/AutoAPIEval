import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_6 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinWorkerThread thread = pool.getForkJoinWorkerThread(Thread.currentThread());
        ForkJoinPool poolFromThread = thread.getPool();
        System.out.println(poolFromThread);
    }
}
