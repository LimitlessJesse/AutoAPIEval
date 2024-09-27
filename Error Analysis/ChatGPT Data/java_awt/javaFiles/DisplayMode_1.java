import java.awt.DisplayMode;

public class DisplayMode_1 {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        int width = displayMode.getWidth();
        System.out.println("Display width: " + width);
    }
}
