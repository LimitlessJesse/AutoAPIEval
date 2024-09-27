import javax.swing.plaf.metal.MetalBorders;
import javax.swing.*;
import java.awt.*;

public class MetalBorders_TextFieldBorder_3 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        Graphics graphics = new JPanel().getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 30;
        
        MetalBorders.TextFieldBorder textFieldBorder = new MetalBorders.TextFieldBorder();
        textFieldBorder.paintBorder(textField, graphics, x, y, width, height);
    }
}
