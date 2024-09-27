import java.awt.SystemTray;
import java.awt.TrayIcon;

public class SystemTray_2 {
    public static void main(String[] args) {
        SystemTray systemTray = SystemTray.getSystemTray();
        TrayIcon[] trayIcons = systemTray.getTrayIcons();
        
        for (TrayIcon trayIcon : trayIcons) {
            // Do something with each tray icon
            System.out.println(trayIcon);
        }
    }
}
