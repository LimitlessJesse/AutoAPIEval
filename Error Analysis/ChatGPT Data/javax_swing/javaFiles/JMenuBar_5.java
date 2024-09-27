import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuBar_5 {
    
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        
        // Create a JMenu
        JMenu menu = new JMenu("Help");
        
        // Set the Help Menu on the JMenuBar
        setHelpMenu(menuBar, menu);
    }
    
    public static void setHelpMenu(JMenuBar menuBar, JMenu menu) {
        menuBar.add(menu);
    }
}
