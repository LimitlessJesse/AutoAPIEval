import javax.swing.JProgressBar;

public class JProgressBar_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(50);
        System.out.println("Progress bar value: " + progressBar.getValue());
    }
}
