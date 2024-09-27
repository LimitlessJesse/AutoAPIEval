import javax.swing.SwingWorker;

public class SwingWorker_3 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Perform lengthy GUI-interaction tasks in the background
                return null;
            }
        };
        
        worker.execute();
    }
}
