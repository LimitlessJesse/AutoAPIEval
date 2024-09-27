import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Arc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 300));
        frame.add(new MyPanel());
        frame.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawArc(50, 50, 100, 100, 0, 180);
    }
}
