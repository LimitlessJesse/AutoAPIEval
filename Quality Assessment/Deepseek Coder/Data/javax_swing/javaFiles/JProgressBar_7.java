import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class JProgressBar_7 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("JProgressBar Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JProgressBar progressBar = new JProgressBar();
                progressBar.setIndeterminate(true); // Set the progress bar to be indeterminate
                
                frame.add(progressBar);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
