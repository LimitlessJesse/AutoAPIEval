import java.awt.DisplayMode;

public class DisplayMode_3 {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        int bitDepth = displayMode.getBitDepth();
        System.out.println("Bit Depth: " + bitDepth);
    }
}
