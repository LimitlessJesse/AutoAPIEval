import javax.swing.JPopupMenu;
import javax.swing.JFrame;

public class JPopupMenu_7 {
    public static void main(String[] args) {
        JPopupMenu popup = new JPopupMenu();
        JFrame frame = new JFrame();
        
        // Make the popup menu visible
        popup.setVisible(true);
        
        // Check if the popup menu is visible
        boolean isPopupVisible = popup.isVisible();
        System.out.println("Is popup visible? " + isPopupVisible);
        
        // Make the popup menu invisible
        popup.setVisible(false);
        
        // Check if the popup menu is visible
        isPopupVisible = popup.isVisible();
        System.out.println("Is popup visible? " + isPopupVisible);
    }
}
