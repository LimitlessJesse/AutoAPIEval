import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class JProgressBar_5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("JProgressBar Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JProgressBar progressBar = new JProgressBar();
                progressBar.setStringPainted(true); // Set the progress bar to display strings
                progressBar.setString("50%"); // Set the initial string

                frame.add(progressBar);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
