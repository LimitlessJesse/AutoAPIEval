import javax.swing.JPopupMenu;

public class JPopupMenu_4 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        
        // Adding components to the popup menu
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");
        popupMenu.add("Option 3");
        
        // Removing the component at index 1
        popupMenu.remove(1);
    }
}
