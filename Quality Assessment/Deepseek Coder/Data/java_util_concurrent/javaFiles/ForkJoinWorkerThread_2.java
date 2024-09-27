import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_2 {
    public static void main(String[] args) {
        ForkJoinWorkerThread thread = new ForkJoinWorkerThread(null);
        thread.start();

        // Add a task to the thread's task queue
        thread.getPendingTask().add(() -> System.out.println("Hello, World"));

        // Wait for the task to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
