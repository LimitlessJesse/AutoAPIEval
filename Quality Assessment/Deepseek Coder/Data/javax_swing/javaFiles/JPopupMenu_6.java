import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;

public class JPopupMenu_6 {
    public static void main(String[] args) {
        JPopupMenu popup = new JPopupMenu();
        
        // Adding a menu item to the popup menu
        popup.add("Option 1");
        
        // Setting the popup menu to be visible
        popup.setVisible(true);
        
        // Waiting for the user to interact with the popup menu
        JOptionPane.showMessageDialog(null, "Please click on the popup menu");
        
        // Setting the popup menu to be invisible
        popup.setVisible(false);
    }
}
