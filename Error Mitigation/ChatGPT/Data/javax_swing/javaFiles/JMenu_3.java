import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenu_3 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem("Save");
        
        menu.add(item1);
        menu.add(item2);
        
        System.out.println("Before removal:");
        for (int i = 0; i < menu.getItemCount(); i++) {
            System.out.println(menu.getItem(i).getText());
        }
        
        menu.remove(1); // Removing the item at index 1
        
        System.out.println("After removal:");
        for (int i = 0; i < menu.getItemCount(); i++) {
            System.out.println(menu.getItem(i).getText());
        }
    }
}
