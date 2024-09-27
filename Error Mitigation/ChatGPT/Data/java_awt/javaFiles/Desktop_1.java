import java.awt.Desktop;

public class Desktop_1 {
    public static void main(String[] args) {
        boolean isSupported = Desktop.isDesktopSupported();
        System.out.println("Is Desktop supported on the current platform? " + isSupported);
    }
}
