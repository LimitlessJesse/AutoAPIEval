import java.awt.BufferCapabilities;

public class BufferCapabilities_2 {
    public static void main(String[] args) {
        BufferCapabilities bufferCapabilities = new BufferCapabilities(null, null, null);
        boolean fullScreenRequired = bufferCapabilities.isFullScreenRequired();
        System.out.println("Is full screen required for page flipping? " + fullScreenRequired);
    }
}
