import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_2 {
    public static void main(String[] args) {
        // Create a custom ForkJoinWorkerThread
        ForkJoinWorkerThread workerThread = new ForkJoinWorkerThread(null) {
            @Override
            protected void onTermination(Throwable exception) {
                // Perform cleanup associated with termination
                System.out.println("Cleaning up worker thread");
                // Invoke super.onTermination at the end of the overridden method
                super.onTermination(exception);
            }
        };
        
        // Simulate termination with an exception
        workerThread.onTermination(new Exception("Simulated exception"));
    }
}
