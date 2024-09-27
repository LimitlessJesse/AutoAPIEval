import java.awt.Graphics;
import java.awt.Canvas;

public class Graphics_3 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas() {
            @Override
            public Graphics getGraphics() {
                return super.getGraphics();
            }
        };

        Graphics g = canvas.getGraphics();
        g.fillRect(50, 50, 100, 100);
    }
}
