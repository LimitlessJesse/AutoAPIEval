import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;

public class Canvas_2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Canvas Example");
        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillRect(50, 50, 200, 200);
            }

            @Override
            public void update(Graphics g) {
                super.update(g);
            }
        };
        
        frame.add(canvas);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
