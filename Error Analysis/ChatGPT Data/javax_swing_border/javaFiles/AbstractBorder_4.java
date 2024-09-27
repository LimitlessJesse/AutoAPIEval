import javax.swing.border.AbstractBorder;
import java.awt.Component;
import java.awt.Rectangle;

public class AbstractBorder_4 {
    public static void main(String[] args) {
        Component c = new Component() {};
        int x = 10;
        int y = 10;
        int width = 100;
        int height = 50;

        AbstractBorder border = new AbstractBorder() {
            @Override
            public Rectangle getInteriorRectangle(Component c, int x, int y, int width, int height) {
                return new Rectangle(x, y, width, height);
            }
        };

        Rectangle interiorRectangle = border.getInteriorRectangle(c, x, y, width, height);
        System.out.println("Interior Rectangle: " + interiorRectangle);
    }
}
