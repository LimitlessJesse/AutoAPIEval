import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class BufferStrategy_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BufferStrategy Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Canvas canvas = new Canvas();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        
        canvas.createBufferStrategy(2);
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        
        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, 400, 400);
        
        bufferStrategy.show();
        
        bufferStrategy.dispose();
    }
}
