import java.awt.*;
import java.awt.image.*;

public class BufferStrategy_4 {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a GraphicsConfiguration
        GraphicsConfiguration gc = frame.getGraphicsConfiguration();

        // Create a BufferStrategy
        frame.createBufferStrategy(2);
        BufferStrategy bs = frame.getBufferStrategy();

        // Use the BufferStrategy
        Graphics2D g2d = (Graphics2D) bs.getDrawGraphics();
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 50, 100, 100);
        bs.show();

        // Dispose the BufferStrategy
        bs.dispose();
    }
}
