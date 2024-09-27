import java.awt.SplashScreen;

public class SplashScreen_4 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        
        if (splash != null) {
            splash.update();
        } else {
            System.out.println("Splash screen not available");
        }
    }
}
