import javax.swing.SwingWorker;

public class SwingWorker_3 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                // Simulate a long-running task
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        // Start the worker
        worker.execute();

        // Check if the worker is done
        boolean isWorkerDone = worker.isDone();
        System.out.println("Is worker done? " + isWorkerDone);
    }
}
