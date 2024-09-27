import javax.swing.SwingWorker;

public class SwingWorker_3 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Perform lengthy task here
                return null;
            }
        };

        worker.execute();

        // Check if the task was cancelled
        if (worker.isCancelled()) {
            System.out.println("Task was cancelled");
        } else {
            System.out.println("Task was not cancelled");
        }
    }
}
