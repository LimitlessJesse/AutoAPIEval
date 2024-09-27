import javax.swing.plaf.basic.BasicBorders;
import javax.swing.*;

public class BasicBorders_RolloverButtonBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        BasicBorders.RolloverButtonBorder border = new BasicBorders.RolloverButtonBorder();
        border.paintBorder(button, button.getGraphics(), 0, 0, button.getWidth(), button.getHeight());
    }
}
