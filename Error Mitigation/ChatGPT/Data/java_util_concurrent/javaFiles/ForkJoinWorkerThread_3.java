import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_3 {
    public static void main(String[] args) {
        ForkJoinWorkerThread workerThread = new ForkJoinWorkerThread(null) {
            @Override
            protected void onStart() {
                ForkJoinPool pool = getPool();
                System.out.println("Pool hosting this thread: " + pool);
            }
        };
        workerThread.start();
    }
}
