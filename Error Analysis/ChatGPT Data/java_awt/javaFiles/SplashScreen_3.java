import java.awt.SplashScreen;

public class SplashScreen_3 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            splash.close();
        } else {
            System.out.println("Splash screen not available.");
        }
    }
}
