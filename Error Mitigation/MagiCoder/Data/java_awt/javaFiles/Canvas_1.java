import java.awt.*;
import java.awt.image.BufferStrategy;

public class MyCanvas extends Canvas {
    private BufferStrategy bs;

    public MyCanvas() {
        createBufferStrategy(2);
        bs = getBufferStrategy();
    }

    @Override
    public void update(Graphics g) {
        if (bs == null) {
            createBufferStrategy(2);
            bs = getBufferStrategy();
            return;
        }

        if (!bs.contentsLost()) {
            do {
                doDrawing(bs.getDrawGraphics());
                bs.show();
            } while (bs.contentsRestored());
        }
    }

    private void doDrawing(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
