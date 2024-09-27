import java.awt.SplashScreen;

public class SplashScreen_5 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash!= null) {
            splash.close();
        }
    }
}
