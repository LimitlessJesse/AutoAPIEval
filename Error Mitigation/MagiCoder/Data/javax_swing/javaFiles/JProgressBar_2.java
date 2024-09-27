import javax.swing.JProgressBar;

public class JProgressBar_2 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(50);

        int minimum = progressBar.getMinimum();
        System.out.println("Minimum value of the progress bar: " + minimum);
    }
}
