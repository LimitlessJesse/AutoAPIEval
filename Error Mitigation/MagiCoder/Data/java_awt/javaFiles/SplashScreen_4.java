import java.awt.Rectangle;
import java.awt.SplashScreen;

public class SplashScreen_4 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash!= null) {
            Rectangle bounds = splash.getBounds();
            System.out.println("Splash screen bounds: " + bounds);
        } else {
            System.out.println("No splash screen found");
        }
    }
}
