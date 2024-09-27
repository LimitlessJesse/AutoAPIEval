import java.awt.image.BufferStrategy;

public class BufferStrategy_4 {
    public static void main(String[] args) {
        BufferStrategy bs = null; // Initialize BufferStrategy
        boolean restored = bs.contentsRestored();
        System.out.println("Contents Restored: " + restored);
    }
}
