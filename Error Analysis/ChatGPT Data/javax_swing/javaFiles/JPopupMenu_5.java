import javax.swing.*;

public class JPopupMenu_5 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        
        popupMenu.add(item1);
        popupMenu.add(item2);
        
        MenuElement[] subElements = popupMenu.getSubElements();
        
        for (MenuElement element : subElements) {
            JMenuItem menuItem = (JMenuItem) element.getComponent();
            System.out.println("Menu Item: " + menuItem.getText());
        }
    }
}
