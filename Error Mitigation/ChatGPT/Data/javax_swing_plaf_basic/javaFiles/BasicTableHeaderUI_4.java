import javax.swing.plaf.basic.BasicTableHeaderUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicTableHeaderUI_4 {
    public static void main(String[] args) {
        BasicTableHeaderUI basicTableHeaderUI = new BasicTableHeaderUI();
        Graphics g = null; // create a Graphics object
        JComponent c = new JComponent() {}; // create a JComponent object
        basicTableHeaderUI.paint(g, c);
    }
}
