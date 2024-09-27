import javax.swing.JProgressBar;

public class JProgressBar_8 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(42);
        String progressString = progressBar.getString();
        System.out.println(progressString);
    }
}
