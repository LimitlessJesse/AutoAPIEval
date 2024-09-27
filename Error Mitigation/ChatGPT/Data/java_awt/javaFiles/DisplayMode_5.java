import java.awt.DisplayMode;

public class DisplayMode_5 {
    public static void main(String[] args) {
        DisplayMode dm1 = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        DisplayMode dm2 = new DisplayMode(1920, 1080, 32, DisplayMode.REFRESH_RATE_UNKNOWN);

        boolean isEqual = dm1.equals(dm2);
        System.out.println("Are the DisplayModes equal? " + isEqual);
    }
}
