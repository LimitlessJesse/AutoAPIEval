import java.awt.TrayIcon;
import java.awt.SystemTray;

public class SystemTray_3 {
    public static void main(String[] args) {
        TrayIcon[] trayIcons = SystemTray.getSystemTray().getTrayIcons();
        
        for (TrayIcon trayIcon : trayIcons) {
            System.out.println(trayIcon);
        }
    }
}
