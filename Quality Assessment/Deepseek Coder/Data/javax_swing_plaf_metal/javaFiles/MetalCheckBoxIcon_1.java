import javax.swing.*;
import javax.swing.plaf.metal.MetalCheckBoxIcon;
import java.awt.*;

public class MetalCheckBoxIcon_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetalCheckBoxIcon checkBoxIcon = new MetalCheckBoxIcon();
        checkBoxIcon.paintIcon(null, frame.getGraphics(), 10, 10);

        frame.setVisible(true);
    }
}
