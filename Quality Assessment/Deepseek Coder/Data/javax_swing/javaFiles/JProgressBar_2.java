import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class JProgressBar_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JProgressBar progressBar = new JProgressBar();
                progressBar.setValue(50);
                int value = progressBar.getValue();
                System.out.println("Value of progress bar: " + value);
            }
        });
    }
}
