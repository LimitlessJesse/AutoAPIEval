import javax.swing.JProgressBar;

public class JProgressBar_1 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        
        setValue(progressBar, 50);
        System.out.println("Current value of progress bar: " + progressBar.getValue());
    }
    
    public static void setValue(JProgressBar progressBar, int n) {
        progressBar.setValue(n);
    }
}
