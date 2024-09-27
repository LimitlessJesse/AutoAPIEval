import javax.swing.JProgressBar;

public class JProgressBar_4 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setString("50%");
        String progressBarString = progressBar.getString();
        System.out.println(progressBarString);
    }
}
