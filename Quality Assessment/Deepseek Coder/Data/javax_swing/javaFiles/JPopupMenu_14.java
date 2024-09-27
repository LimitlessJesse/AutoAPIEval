import javax.swing.JFrame;
import javax.swing.JPopupMenu;

public class JPopupMenu_14 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");
        popupMenu.add("Option 3");

        // Set the location of the popup menu
        popupMenu.setLocation(100, 50);

        // Add the popup menu to the JFrame
        frame.add(popupMenu);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
