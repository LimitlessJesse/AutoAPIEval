import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class DisplayMode_1 {
    public static void main(String[] args) {
        DisplayMode displayMode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
        int bitDepth = displayMode.getBitDepth();
        System.out.println("Bit Depth: " + bitDepth);
    }
}
