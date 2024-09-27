import java.awt.Canvas;
import java.awt.BufferStrategy;

public class Canvas_4 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.createBufferStrategy(3); // Create a buffer strategy before calling getBufferStrategy()
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        System.out.println("Buffer Strategy: " + bufferStrategy);
    }
}
