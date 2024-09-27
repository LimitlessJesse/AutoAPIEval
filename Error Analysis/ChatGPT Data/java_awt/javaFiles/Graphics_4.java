import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Oval Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }

    static class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(50, 50, 100, 100);
        }
    }
}
