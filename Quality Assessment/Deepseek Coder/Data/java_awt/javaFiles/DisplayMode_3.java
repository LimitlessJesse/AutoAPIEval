import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class DisplayMode_3 {
    public static void main(String[] args) {
        DisplayMode displayMode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
        int refreshRate = displayMode.getRefreshRate();
        System.out.println("Refresh Rate: " + refreshRate);
    }
}
