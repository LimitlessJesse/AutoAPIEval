import java.awt.SplashScreen;

public class SplashScreen_5 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            boolean isVisible = splash.isVisible();
            System.out.println("Is splash screen visible: " + isVisible);
        } else {
            System.out.println("No splash screen available");
        }
    }
}
