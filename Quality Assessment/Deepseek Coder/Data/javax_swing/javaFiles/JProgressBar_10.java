import javax.swing.JProgressBar;

public class JProgressBar_10 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(10);
        int min = progressBar.getMinimum();
        System.out.println("Minimum value of JProgressBar is: " + min);
    }
}
