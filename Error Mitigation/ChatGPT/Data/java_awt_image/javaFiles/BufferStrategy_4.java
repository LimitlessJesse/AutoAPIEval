import java.awt.image.BufferCapabilities;

public class BufferStrategy_4 {
    public static void main(String[] args) {
        // Create a BufferStrategy object
        BufferCapabilities bufferCapabilities = new BufferCapabilities(null, null, null);
        
        // Get the BufferCapabilities for this BufferStrategy
        BufferCapabilities capabilities = bufferCapabilities.getCapabilities();
        
        // Print the buffering capabilities of this strategy
        System.out.println("Buffering capabilities: " + capabilities);
    }
}
