import java.awt.SplashScreen;

public class SplashScreen_1 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash!= null) {
            boolean visible = splash.isVisible();
            System.out.println("Is splash screen visible? " + visible);
        } else {
            System.out.println("No splash screen available");
        }
    }
}
