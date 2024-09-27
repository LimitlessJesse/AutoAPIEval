import javax.swing.*;

public class JFileChooser_22 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        //...
        // Perform some operations on the file chooser
        //...

        // Update the UI of the file chooser
        SwingUtilities.getWindowAncestor(fileChooser).updateUI();
    }
}
