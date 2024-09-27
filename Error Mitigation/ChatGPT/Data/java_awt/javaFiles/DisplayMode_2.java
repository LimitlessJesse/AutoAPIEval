import java.awt.DisplayMode;

public class DisplayMode_2 {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        int height = displayMode.getHeight();
        System.out.println("Height of the display: " + height + " pixels");
    }
}
