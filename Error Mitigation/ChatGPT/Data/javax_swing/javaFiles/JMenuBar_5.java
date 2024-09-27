import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuBar_5 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");
        
        menuBar.setHelpMenu(helpMenu);
    }
}
