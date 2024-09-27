import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class DisplayMode_2 {
    public static void main(String[] args) {
        DisplayMode displayMode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
        int height = displayMode.getHeight();
        System.out.println("Display height: " + height);
    }
}
