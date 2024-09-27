import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontMetrics_1 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Width Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                String text = "Hello, World!";
                FontMetrics fontMetrics = g2d.getFontMetrics();
                int width = fontMetrics.stringWidth(text);
                
                g2d.drawString(text, 50, 50);
                g2d.drawString("Width: " + width, 50, 70);
            }
        };
        
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
