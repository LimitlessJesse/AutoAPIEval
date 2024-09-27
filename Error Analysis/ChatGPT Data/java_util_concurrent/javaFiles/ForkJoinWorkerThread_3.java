import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_3 {
    public static void main(String[] args) {
        ForkJoinWorkerThread workerThread = (ForkJoinWorkerThread) Thread.currentThread();
        ForkJoinPool pool = workerThread.getPool();
        System.out.println("Pool: " + pool);
    }
}
