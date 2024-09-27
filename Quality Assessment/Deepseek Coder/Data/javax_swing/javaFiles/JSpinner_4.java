import javax.swing.*;
import javax.swing.SpinnerNumberModel;

public class JSpinner_4 {
    public static void main(String[] args) {
        // Create a spinner model
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);

        // Create a spinner
        JSpinner spinner = new JSpinner(spinnerModel);

        // Get the editor component of the spinner
        JComponent editor = spinner.getEditor();

        // Add the spinner to a frame
        JFrame frame = new JFrame("JSpinner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(spinner);
        frame.pack();
        frame.setVisible(true);
    }
}
