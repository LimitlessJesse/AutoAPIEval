import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class BufferStrategy_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BufferStrategy Example");
        Canvas canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(800, 600));
        
        frame.add(canvas);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        canvas.createBufferStrategy(3);
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        
        // Now you can use bufferStrategy.getDrawGraphics() to draw on the canvas
        
        // Example:
        // Graphics g = bufferStrategy.getDrawGraphics();
        // g.setColor(Color.RED);
        // g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        // g.dispose();
        
    }
}
