import java.awt.Graphics;
import java.awt.Canvas;

public class Graphics_4 extends Canvas {
    public static void main(String[] args) {
        Graphics_4 canvas = new Graphics_4();
        Graphics g = canvas.getGraphics();
        canvas.paint(g);
    }

    public void paint(Graphics g) {
        g.drawOval(50, 50, 200, 100);
    }
}
