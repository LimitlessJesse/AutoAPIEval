import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import java.awt.*;

public class MetalBorders_TextFieldBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);
        frame.add(textField, BorderLayout.NORTH);

        frame.setSize(300, 200);
        frame.setVisible(true);

        paintBorder(textField, textField.getGraphics(), 0, 0, textField.getWidth(), textField.getHeight());
    }

    public static void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        TextFieldBorder border = new TextFieldBorder();
        border.paintBorder(c, g, x, y, width, height);
    }
}
