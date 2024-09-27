import javax.swing.plaf.basic.BasicToolBarUI;
import java.awt.Point;

public class BasicToolBarUI_2 {
    public static void main(String[] args) {
        BasicToolBarUI basicToolBarUI = new BasicToolBarUI();
        boolean b = true;
        Point p = new Point(10, 20);
        basicToolBarUI.setFloating(b, p);
    }
}
