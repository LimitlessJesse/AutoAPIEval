import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_InternalFrameBorder_5 {
    public static void main(String[] args) {
        InternalFrameBorder border = new InternalFrameBorder() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                // Your custom implementation of paintBorder method
            }
        };
    }
}
