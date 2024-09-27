import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenu_5 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        menu.removeAll();

        System.out.println("Menu items after removeAll: " + menu.getItemCount());
    }
}
