import java.awt.image.BufferStrategy;

public class BufferStrategy_2 {
    public static void main(String[] args) {
        BufferStrategy bufferStrategy = null; // Initialize your BufferStrategy object here
        
        boolean lost = bufferStrategy.contentsLost();
        System.out.println("Drawing buffer lost: " + lost);
    }
}
