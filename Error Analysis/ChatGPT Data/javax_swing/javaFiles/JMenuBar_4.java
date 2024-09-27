import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBar_4 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenuItem("File"));
        menuBar.add(new JMenuItem("Edit"));
        
        int menuCount = menuBar.getMenuCount();
        System.out.println("Menu count: " + menuCount);
    }
}
