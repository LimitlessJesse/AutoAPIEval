import javax.swing.JProgressBar;

public class JProgressBar_12 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMaximum(100);
        int maximum = progressBar.getMaximum();
        System.out.println("The maximum value of the progress bar is: " + maximum);
    }
}
