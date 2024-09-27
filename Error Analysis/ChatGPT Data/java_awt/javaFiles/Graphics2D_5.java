import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics2D_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stroke Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CustomPanel());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    static class CustomPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            BasicStroke stroke = new BasicStroke(5.0f);
            g2d.setStroke(stroke);

            g2d.setColor(Color.RED);
            g2d.drawRect(50, 50, 100, 100);

            g2d.setColor(Color.BLUE);
            g2d.drawLine(200, 100, 300, 200);
        }
    }
}
