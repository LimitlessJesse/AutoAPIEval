import javax.swing.SwingWorker;
import javax.swing.ProgressMonitor;

public class ProgressMonitor_3 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Please wait...", "", 0, 100);

        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    publish(i);
                    Thread.sleep(100);
                }
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                for (Integer chunk : chunks) {
                    progressMonitor.setProgress(chunk);
                }
            }
        };

        worker.execute();
    }
}
