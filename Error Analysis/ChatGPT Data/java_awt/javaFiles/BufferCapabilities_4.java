import java.awt.BufferCapabilities;

public class BufferCapabilities_4 {
    public static void main(String[] args) {
        BufferCapabilities caps = new BufferCapabilities(null, null, null);
        boolean isFlipping = caps.isPageFlipping();
        System.out.println("Is page flipping enabled: " + isFlipping);
    }
}
