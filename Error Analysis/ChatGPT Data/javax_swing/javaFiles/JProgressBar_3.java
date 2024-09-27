import javax.swing.JProgressBar;

public class JProgressBar_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        String text = "Loading...";
        progressBar.setString(text);
        System.out.println("Progress bar text: " + progressBar.getString());
    }
}
