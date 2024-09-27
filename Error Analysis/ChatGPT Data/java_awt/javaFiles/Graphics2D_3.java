import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics2D_3 extends JPanel {
    
    public void draw(Shape s, Graphics2D g2d) {
        g2d.draw(s);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        Ellipse2D circle = new Ellipse2D.Double(50, 50, 100, 100);
        
        draw(circle, g2d);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shape Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
