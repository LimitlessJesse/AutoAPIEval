import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class BorderFactory_4 {
    public static void main(String[] args) {
        Color color = Color.RED;
        LineBorder lineBorder = (LineBorder) BorderFactory.createLineBorder(color);
    }
}
