import java.awt.BufferCapabilities;

public class BufferCapabilities_3 {
    public static void main(String[] args) {
        BufferCapabilities bufferCapabilities = new BufferCapabilities(null, null, null);
        boolean pageFlipping = bufferCapabilities.isPageFlipping();
        System.out.println("Page flipping enabled: " + pageFlipping);
    }
}
