import javax.swing.plaf.basic.BasicListUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicListUI_4 {
    public static void main(String[] args) {
        BasicListUI basicListUI = new BasicListUI();
        Graphics g = null; // create a Graphics object
        JComponent c = new JComponent(); // create a JComponent object
        basicListUI.paint(g, c);
    }
}
