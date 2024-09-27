import java.awt.Canvas;
import java.awt.image.BufferStrategy;

public class Canvas_3 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.createBufferStrategy(2); // Creating a buffer strategy with 2 buffers
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        // Use the buffer strategy for rendering or trapping input events
    }
}
