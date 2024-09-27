import javax.swing.JProgressBar;

public class JProgressBar_5 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        
        // Set the progress bar to indeterminate mode
        progressBar.setIndeterminate(true);
        
        // Print the current state of the progress bar
        System.out.println("Is indeterminate: " + progressBar.isIndeterminate());
    }
}
