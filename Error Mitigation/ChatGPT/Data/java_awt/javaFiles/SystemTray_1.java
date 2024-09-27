import java.awt.SystemTray;

public class SystemTray_1 {
    public static void main(String[] args) {
        boolean isSystemTraySupported = SystemTray.isSupported();
        System.out.println("System tray supported: " + isSystemTraySupported);
    }
}
