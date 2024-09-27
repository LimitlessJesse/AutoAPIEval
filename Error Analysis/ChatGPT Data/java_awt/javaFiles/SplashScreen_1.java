import java.awt.SplashScreen;

public class SplashScreen_1 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            // Update the splash screen
            splash.update();
        } else {
            System.out.println("Splash screen is not available");
        }
    }
}
