import java.awt.*;
import javax.swing.*;

public class Graphics_5 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Fills an oval bounded by the specified rectangle
        g.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fill Oval Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
