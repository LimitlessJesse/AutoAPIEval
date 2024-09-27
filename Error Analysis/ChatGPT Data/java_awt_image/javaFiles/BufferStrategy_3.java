import java.awt.image.BufferStrategy;

public class BufferStrategy_3 {
    public static void main(String[] args) {
        BufferStrategy bufferStrategy = // initialize BufferStrategy object
        boolean contentLost = bufferStrategy.contentsLost();
        System.out.println("Buffer strategy content lost: " + contentLost);
    }
}
