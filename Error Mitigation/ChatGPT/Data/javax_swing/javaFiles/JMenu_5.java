import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenu_5 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem("Save");
        
        menu.add(item1);
        menu.add(item2);
        
        JMenuItem retrievedItem = menu.getItem(1);
        System.out.println("Retrieved item: " + retrievedItem.getText());
    }
}
