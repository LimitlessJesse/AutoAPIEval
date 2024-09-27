import javax.swing.JProgressBar;

public class JProgressBar_9 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(50);
        System.out.println("Minimum value of progress bar: " + progressBar.getMinimum());
    }
}
