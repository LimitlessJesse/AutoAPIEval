import javax.swing.SwingWorker;

public class SwingWorker_2 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Perform lengthy GUI-interaction tasks in the background
                return null;
            }

            @Override
            protected void done() {
                // Executed on the Event Dispatch Thread after the doInBackground method is finished
                // Perform completion actions here
            }
        };

        worker.execute();
    }
}
