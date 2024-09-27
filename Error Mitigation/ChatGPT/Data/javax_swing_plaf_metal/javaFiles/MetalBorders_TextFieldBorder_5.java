import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_TextFieldBorder_5 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        Border border = new MetalBorders.TextFieldBorder();
        border.paintBorder(textField, textField.getGraphics(), 0, 0, textField.getWidth(), textField.getHeight());
    }
}
