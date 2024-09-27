import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import java.awt.*;

public class MetalBorders_InternalFrameBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBorder(new javax.swing.plaf.metal.MetalBorders.InternalFrameBorder());
        frame.add(panel);

        Insets insets = new InsetsUIResource();
        panel.getBorder().getBorderInsets(panel, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
