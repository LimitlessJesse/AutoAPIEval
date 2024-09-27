import javax.swing.JProgressBar;

public class JProgressBar_8 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        boolean isIndeterminate = progressBar.isIndeterminate();
        System.out.println("Is the progress bar indeterminate? " + isIndeterminate);
    }
}
