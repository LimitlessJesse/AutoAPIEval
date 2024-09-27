import java.awt.BufferCapabilities;

public class BufferCapabilities_4 {
    public static void main(String[] args) {
        BufferCapabilities bufferCapabilities = new BufferCapabilities(null, null, null);
        boolean isMultiBufferAvailable = bufferCapabilities.isMultiBufferAvailable();
        System.out.println("Is Multi Buffer Available: " + isMultiBufferAvailable);
    }
}
