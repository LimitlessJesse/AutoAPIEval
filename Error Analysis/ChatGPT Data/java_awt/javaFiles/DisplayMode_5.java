import java.awt.DisplayMode;

public class DisplayMode_5 {
    public static void main(String[] args) {
        DisplayMode mode1 = new DisplayMode(1920, 1080, 60, DisplayMode.REFRESH_RATE_UNKNOWN);
        DisplayMode mode2 = new DisplayMode(1280, 720, 60, DisplayMode.REFRESH_RATE_UNKNOWN);

        System.out.println(mode1.equals(mode2)); // Output: false
    }
}
