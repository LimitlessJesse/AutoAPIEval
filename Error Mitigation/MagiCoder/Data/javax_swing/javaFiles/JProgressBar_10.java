import javax.swing.JProgressBar;

public class JProgressBar_10 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        boolean isStringPainted = progressBar.isStringPainted();
        System.out.println("Is string painted: " + isStringPainted);
    }
}
