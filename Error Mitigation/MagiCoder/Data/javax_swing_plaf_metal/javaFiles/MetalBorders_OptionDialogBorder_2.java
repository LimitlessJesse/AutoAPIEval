import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_OptionDialogBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBorder(new MetalBorders.OptionDialogBorder());

        frame.add(button);
        frame.setVisible(true);
    }
}
