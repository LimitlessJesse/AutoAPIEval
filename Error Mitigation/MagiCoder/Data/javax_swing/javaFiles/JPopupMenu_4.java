import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;

public class JPopupMenu_4 {
    public static void main(String[] args) {
        JPopupMenu popup = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");

        popup.add(item1);
        popup.addSeparator();
        popup.add(item2);
    }
}
