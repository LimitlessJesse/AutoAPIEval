import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.ButtonBorder;
import java.awt.*;

public class MetalBorders_ButtonBorder_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 200, 50);
        button.setBorder(new ButtonBorder());

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

class ButtonBorder extends MetalBorders.ButtonBorder {
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        super.paintBorder(c, g, x, y, width, height);
        g.setColor(Color.RED);
        g.drawRect(x, y, width-1, height-1);
    }
}
