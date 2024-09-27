import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Frame;

public class Canvas_1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Canvas Example");
        Canvas canvas = new Canvas() {
            public void paint(Graphics g) {
                // Custom painting of the canvas
                g.drawString("Hello, World!", 50, 50);
            }
        };
        frame.add(canvas);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
