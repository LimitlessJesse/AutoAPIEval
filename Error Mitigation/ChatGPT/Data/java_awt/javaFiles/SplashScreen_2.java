import java.awt.Dimension;
import java.awt.SplashScreen;

public class SplashScreen_2 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            Dimension size = splash.getSize();
            System.out.println("Splash screen size: " + size);
        } else {
            System.out.println("No splash screen available");
        }
    }
}
