import java.awt.*;
import java.awt.Canvas;

public class Canvas_2 extends Canvas {
    public void update(Graphics g) {
        g.drawString("Hello, World", 50, 50);
    }

    public static void main(String[] args) {
        Canvas_2 canvas = new Canvas_2();
        canvas.setSize(400, 400);
        Container container = new Container();
        container.setLayout(new FlowLayout());
        container.add(canvas);
        Frame frame = new Frame("Canvas Example");
        frame.add(container);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
