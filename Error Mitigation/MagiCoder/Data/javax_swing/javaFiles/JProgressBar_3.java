import javax.swing.JProgressBar;

public class JProgressBar_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(50);
        int value = progressBar.getValue();
        System.out.println("Current value of the progress bar: " + value);
    }
}
