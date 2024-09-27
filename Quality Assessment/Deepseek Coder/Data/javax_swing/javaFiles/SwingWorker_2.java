import javax.swing.SwingWorker;
import java.lang.reflect.Method;

public class SwingWorker_2 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Simulate a long running task
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    // Check if the task has been cancelled
                    if (isCancelled()) {
                        System.out.println("Task cancelled");
                        return null;
                    }
                }
                return null;
            }
        };

        worker.execute();

        // Wait for the task to complete
        try {
            worker.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the task was cancelled
        if (worker.isCancelled()) {
            System.out.println("Task was cancelled");
        } else {
            System.out.println("Task was not cancelled");
        }
    }
}
