import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import java.awt.*;

public class AbstractBorder_2 {
    public static void main(String[] args) {
        Border border = new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }
        };

        System.out.println(border.isBorderOpaque());
    }
}
