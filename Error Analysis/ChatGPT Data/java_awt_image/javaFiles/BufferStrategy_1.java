import java.awt.*;
import java.awt.image.BufferStrategy;

public class BufferStrategy_1 {
    public static void main(String[] args) {
        // Create a window
        Frame frame = new Frame("BufferStrategy Example");

        // Set the size of the window
        frame.setSize(400, 300);
        
        // Make the window visible
        frame.setVisible(true);

        // Create a BufferStrategy
        frame.createBufferStrategy(2);
        BufferStrategy bufferStrategy = frame.getBufferStrategy();

        // Show the buffer
        bufferStrategy.show();
    }
}
