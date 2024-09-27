import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.ProgressMonitor;

public class ProgressMonitor_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("ProgressMonitor Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 100);

                final ProgressMonitor monitor = new ProgressMonitor(frame, "Please wait...", "Processing data...", 0, 100);

                new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            monitor.setNote("Processing data: " + i + "%");
                            monitor.setProgress(i);
                        }
                    }
                }).start();

                frame.setVisible(true);
            }
        });
    }
}
