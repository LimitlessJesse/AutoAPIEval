import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuBar_3 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        
        JMenu retrievedMenu = menuBar.getMenu(1);
        System.out.println("Retrieved menu: " + retrievedMenu.getText());
    }
}
