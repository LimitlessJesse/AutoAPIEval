import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_1 {
    public static void main(String[] args) {
        AbstractBorder border = new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }
        };

        Insets insets = border.getBorderInsets(new JComponent());
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
