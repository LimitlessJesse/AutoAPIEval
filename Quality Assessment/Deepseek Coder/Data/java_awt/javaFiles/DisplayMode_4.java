import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class DisplayMode_4 {
    public static void main(String[] args) {
        DisplayMode displayMode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
        int width = displayMode.getWidth();
        System.out.println("Width of the display mode: " + width);
    }
}
