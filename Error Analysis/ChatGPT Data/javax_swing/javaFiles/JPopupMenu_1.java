import javax.swing.*;

public class JPopupMenu_1 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Menu Item");
        popupMenu.add(menuItem);
        
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        popupMenu.show(frame, 100, 100);
    }
}
