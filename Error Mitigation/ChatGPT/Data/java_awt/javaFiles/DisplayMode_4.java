import java.awt.DisplayMode;

public class DisplayMode_4 {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        int refreshRate = displayMode.getRefreshRate();
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
    }
}
