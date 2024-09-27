import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class BasicToolTipUI_2 {
    public static void main(String[] args) {
        
    }

    public void paint(Graphics g, JComponent c) {
        BasicToolTipUI ui = new BasicToolTipUI();
        ui.paint(g, c);
    }
}
