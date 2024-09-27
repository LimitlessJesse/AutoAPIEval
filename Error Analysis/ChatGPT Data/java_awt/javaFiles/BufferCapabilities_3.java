import java.awt.BufferCapabilities;

public class BufferCapabilities_3 {
    public static void main(String[] args) {
        // Create a BufferCapabilities object
        BufferCapabilities capabilities = new BufferCapabilities(null, null, null);
        
        // Check if full screen mode is required
        boolean isFullScreenRequired = capabilities.isFullScreenRequired();
        
        // Print the result
        System.out.println("Is full screen required? " + isFullScreenRequired);
    }
}
