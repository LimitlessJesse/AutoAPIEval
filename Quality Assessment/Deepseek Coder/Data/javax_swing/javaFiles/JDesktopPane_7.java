import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JDesktopPane_7 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JDesktopPane Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JDesktopPane
        JDesktopPane desktop = new JDesktopPane();

        // Create a JLabel and add it to the desktop pane
        JLabel label = new JLabel("Hello, World!");
        desktop.add(label);

        // Add the desktop pane to the JFrame
        frame.add(desktop);

        // Make the JFrame visible
        frame.setVisible(true);

        // Remove the JLabel from the desktop pane
        desktop.remove(label);

        // The JLabel is no longer visible because it was removed from the desktop pane
    }
}
