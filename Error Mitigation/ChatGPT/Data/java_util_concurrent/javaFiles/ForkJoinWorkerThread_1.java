import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_1 {
    public static void main(String[] args) {
        // Create a custom ForkJoinWorkerThread
        ForkJoinWorkerThread workerThread = new ForkJoinWorkerThread(null) {
            @Override
            protected void onStart() {
                super.onStart();
                // Custom initialization code here
                System.out.println("Worker thread started");
            }
        };
        
        // Start the worker thread
        workerThread.start();
    }
}
